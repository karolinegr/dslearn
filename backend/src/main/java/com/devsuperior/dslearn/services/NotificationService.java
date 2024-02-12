package com.devsuperior.dslearn.services;

import com.devsuperior.dslearn.dto.NotificationDTO;
import com.devsuperior.dslearn.entities.Notification;
import com.devsuperior.dslearn.entities.User;
import com.devsuperior.dslearn.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
public class NotificationService implements Serializable {
    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationsForCurrentUser(boolean unreadOnly, Pageable pageable){
        User user = this.authService.authenticated();
        Page<Notification> page = this.notificationRepository.find(user, unreadOnly, pageable);
        return page.map(NotificationDTO::new);
    }
}
