package com.satishlabs.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.satishlabs.dto.RegisterRequest;
import com.satishlabs.repository.UserRepository;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import java.util.HashSet;
import java.util.Set;

@Component
public class UserRegistrationValidator {

    private final UserRepository userRepository;

    public UserRegistrationValidator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void validate(RegisterRequest request) {
        Set<String> errors = new HashSet<>();

        // 1️⃣ Username not blank
        if (!StringUtils.hasText(request.getUsername())) {
            errors.add("Username is required");
        } else if (userRepository.existsByUsername(request.getUsername())) {
            errors.add("Username already exists");
        }

        // 2️⃣ Password checks
        if (!StringUtils.hasText(request.getPassword())) {
            errors.add("Password is required");
        } else if (request.getPassword().length() < 6) {
            errors.add("Password must be at least 6 characters");
        }

        // 3️⃣ Confirm password matches
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            errors.add("Password and Confirm Password do not match");
        }

        if (!errors.isEmpty()) {
            throw new ConstraintViolationException(
                    errors.stream()
                          .map(msg -> new SimpleConstraintViolation(msg))
                          .collect(HashSet::new, HashSet::add, HashSet::addAll)
            );
        }
    }

    // Helper class to wrap errors in ConstraintViolation
    private static class SimpleConstraintViolation implements ConstraintViolation<RegisterRequest> {

        private final String message;

        SimpleConstraintViolation(String message) {
            this.message = message;
        }

        @Override
        public String getMessage() {
            return message;
        }

        @Override public String getMessageTemplate() { return message; }
        @Override public RegisterRequest getRootBean() { return null; }
        @Override public Class<RegisterRequest> getRootBeanClass() { return RegisterRequest.class; }
        @Override public Object getLeafBean() { return null; }
        @Override public Object[] getExecutableParameters() { return new Object[0]; }
        @Override public Object getExecutableReturnValue() { return null; }
        @Override public Object getInvalidValue() { return null; }
        @Override public jakarta.validation.Path getPropertyPath() { return null; }
        @Override public jakarta.validation.metadata.ConstraintDescriptor<?> getConstraintDescriptor() { return null; }
        @Override public <U> U unwrap(Class<U> type) { return null; }
    }
}
