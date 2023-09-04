package com.devsuperior.dslearn.services;

import com.devsuperior.dslearn.dto.DeliverReviewDTO;
import com.devsuperior.dslearn.entities.Deliver;
import com.devsuperior.dslearn.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
public class DeliverReviewService implements Serializable {
    @Autowired
    private DeliverRepository deliverRepository;

    @Transactional
    public void saveReview(Long id, DeliverReviewDTO deliverReviewDTO){
        Deliver deliver = this.deliverRepository.getReferenceById(id);
        deliver.setStatus(deliverReviewDTO.getStatus());
        deliver.setFeedback(deliverReviewDTO.getFeedback());
        deliver.setCorrectCount(deliverReviewDTO.getCorrectCount());
        this.deliverRepository.save(deliver);
    }
}
