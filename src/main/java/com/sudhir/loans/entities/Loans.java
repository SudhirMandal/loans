package com.sudhir.loans.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "loans")
@EntityListeners(AuditingEntityListener.class)
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Integer loanId;
    @Column(name = "loan_type")
    private String loanType;
    @Column(name = "loan_amount")
    private Double loanAmount;
    @Column(name = "loan_paid")
    private Double loanPaid;
    @Column(name = "loan_outstanding")
    private Double loanOutstanding;
    @Column(name = "loan_takenAt")
    @CreatedDate
    private LocalDateTime loanTakenAt;
    @Column(name = "customer_id")
    private Integer customerId;

}
