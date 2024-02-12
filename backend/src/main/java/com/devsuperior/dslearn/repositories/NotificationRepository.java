package com.devsuperior.dslearn.repositories;

import com.devsuperior.dslearn.entities.Notification;
import com.devsuperior.dslearn.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    @Query("select obj from Notification obj where " +
            "(obj.user = :user) AND " +
            "(:unreadOnly = false OR obj.read = false) " +
            "order by obj.moment desc")
    Page<Notification> find(User user, boolean unreadOnly, Pageable pageable);
}
