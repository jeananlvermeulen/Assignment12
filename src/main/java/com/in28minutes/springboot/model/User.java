package com.in28minutes.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import net.guides.springboot.springboot2jpaauditing.audit.Auditable;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)

public class User {
}
