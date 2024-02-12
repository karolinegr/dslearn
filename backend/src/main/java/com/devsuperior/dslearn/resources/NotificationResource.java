package com.devsuperior.dslearn.resources;

import com.devsuperior.dslearn.dto.NotificationDTO;
import com.devsuperior.dslearn.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {
    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(
            @RequestParam(name = "unreadOnly", defaultValue = "false", required = false)
            Boolean unreadOnly,
            Pageable pageable){
        Page<NotificationDTO> notificationDTO = this.notificationService.notificationsForCurrentUser(unreadOnly, pageable);
        return ResponseEntity.ok().body(notificationDTO);
    }
}
