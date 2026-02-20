package com.example.creditprofile.service;

import com.example.creditprofile.dto.CreateCustomerRequest;
import com.example.creditprofile.dto.CustomerResponse;
import com.example.creditprofile.entity.CustomerEntity;
import com.example.creditprofile.exception.NotFoundException;
import com.example.creditprofile.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public Page<CustomerResponse> list(Pageable pageable) {
        return repo.findAll(pageable).map(this::toResponse);
    }

    public CustomerResponse get(Long id) {
        CustomerEntity entity = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Customer with id " + id + " was not found"));
        return toResponse(entity);
    }

    public CustomerResponse create(CreateCustomerRequest req) {
        CustomerEntity saved = repo.save(new CustomerEntity(req.fullName(), req.creditScore()));
        return toResponse(saved);
    }

    private CustomerResponse toResponse(CustomerEntity e) {
        return new CustomerResponse(e.getId(), e.getFullName(), e.getCreditScore(), e.getCreatedAt());
    }
}
