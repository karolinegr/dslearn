package com.devsuperior.dslearn.resources;

import com.devsuperior.dslearn.dto.DeliverReviewDTO;
import com.devsuperior.dslearn.services.DeliverReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource implements Serializable {
    @Autowired
    private DeliverReviewService deliverReviewService;

    @PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> notificationsForCurrentUser(
            @PathVariable
            Long id,
            @RequestBody
            DeliverReviewDTO deliverReviewDTO){
        this.deliverReviewService.saveReview(id, deliverReviewDTO);
        return ResponseEntity.noContent().build();
    }
}
