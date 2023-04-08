package com.backendmarch.librarymanagementsystem.DTO;

import com.backendmarch.librarymanagementsystem.Enum.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class IssueBookResponseDto {

    private String transactionId;
    private String bookName;
    private TransactionStatus transactionStatus;
}
