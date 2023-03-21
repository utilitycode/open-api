package com.example.openapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="store_master")
public class StoreMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id", nullable = false, unique = true, columnDefinition = "Unique value for the each row")
    private Long recordId ;

    @Column(name = "store_no", nullable = false, unique = true, columnDefinition = "Unique number allotted for the store")
    @NotNull(message = "Store No cannot be null")
    @NotBlank(message = "Store No cannot be blank")
    @NotEmpty(message = "Store No cannot be empty")
    private String c;

    @Column(name = "store_name", nullable = false, unique = true, columnDefinition = "Unique number allotted for the store")
    @NotNull(message = "Store Name cannot be null")
    @NotBlank(message = "Store Name cannot be blank")
    @NotEmpty(message = "Store Name cannot be empty")
    private String storeName;

    @Column(name = "opening_date", nullable = false, unique = true, columnDefinition = "Date on which the store was opened.")
    @NotNull(message = "Opening Date cannot be null")
    @NotBlank(message = "Opening Date cannot be blank")
    @NotEmpty(message = "Opening Date cannot be empty")
    @FutureOrPresent(message = "Opening date must be present or future date")
    private Date openingDate;

    @Column(name = "store_status", nullable = false, unique = true, columnDefinition = "Current status of the store")
    @NotNull(message = "Store Status cannot be null")
    @NotBlank(message = "Store Status cannot be blank")
    @NotEmpty(message = "Store Status cannot be empty")
    private String storeStatus;

    @Column(name = "closing_date", nullable = true, unique = false, columnDefinition = "Date on which the stre was closed.")
    @PastOrPresent(message = "Closing date cannot be future date")
    private Date closingDate;

    @Column(name = "MDS", nullable = true, unique = false, columnDefinition = "Whether the store has McDelivery Sales?")
    private String mds;

    @Column(name = "MDS_launched", nullable = true, unique = false, columnDefinition = "Date on which the store was converted to McDelivery Service")
    private Date mdsLaunched;

    @Column(name = "Mccafe", nullable = true, unique = false, columnDefinition = "Whether the store is Mccafe?")
    private String mccafe;

    @Column(name = "Mccafe_launched", nullable = true, unique = false, columnDefinition = "Date on which the store was converted to Mccafe")
    private Date mccafeLaunched;

    @Column(name = "store_classification", nullable = false, unique = false, columnDefinition = "Classfication of the store")
    @NotNull(message = "Store Classification cannot be null")
    @NotBlank(message = "Store Classfication be blank")
    @NotEmpty(message = "Store Calssification cannot be empty")
    private String storeClassification;

    @Column(name = "OD_name", nullable = false, unique = false, columnDefinition = "Operational Director allotted for the store")
    @NotNull(message = "OD Name cannot be null")
    @NotBlank(message = "OD Name cannot be blank")
    @NotEmpty(message = "OD Name cannot be empty")
    private String odName ;

    @Column(name = "OC_name", nullable = false, unique = false, columnDefinition = "Operational Chief allotted for the store")
    @NotNull(message = "OC Name cannot be null")
    @NotBlank(message = "OC Name cannot be blank")
    @NotEmpty(message = "OC Name cannot be empty")
    private String ocName;

    @Column(name = "OM_name", nullable = false, unique = false, columnDefinition = "Operational Manager allotted for the store")
    @NotNull(message = "OM Name cannot be null")
    @NotBlank(message = "OM Name cannot be blank")
    @NotEmpty(message = "OM Name cannot be empty")
    private String omName;

    @Column(name="store_email", nullable = false, unique = true, columnDefinition = "Email of the store")
    @Email
    @NotNull(message = "Store Email cannot be null")
    @NotBlank(message = "Store Email cannot be blank")
    @NotEmpty(message = "Store Email cannot be empty")
    private String storeEmail;

    @Column(name = "ip", nullable = false, unique = true, columnDefinition = "Ip Address required for API")
    @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
    @NotNull(message = "IP Address cannot be null")
    @NotBlank(message = "IP Address cannot be blank")
    @NotEmpty(message = "Ip Adresss cannot be empty")
    private String ipAddress; 
}
