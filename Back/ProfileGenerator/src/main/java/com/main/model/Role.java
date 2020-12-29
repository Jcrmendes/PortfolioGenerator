package com.main.model;


import javax.persistence.*;

/**
 * Define the table name as PG_Role
 *
 * @Entity -> A class of type Entity indicates that, at an abstract level, is correlated with a table in the database. Each object instantiated by this class indicates a tuple of the table
 *            itself, containing the information of the latter.
 *
 * @GeneratedValue -> Is used to specify how the primary key should be generated. Options:
 *                      -> Increment: generates identifiers of type long, short or int that are unique only when no other process is inserting data into the same table;
 *                      -> identity: supports identity columns in DB2, MYSQL, MS SQL Server, SyBase and HypersonicSQL.
 *                      -> Sequence: uses a sequence in DB2, PostgreSQL, Oracle, SAP DB, McKoi or a generator in Interbase. The returned identifier is of type long, short or int
 *                      -> For more information check: https://stackoverflow.com/questions/10041938/how-to-choose-the-id-generation-strategy-when-using-jpa-and-hibernate
 *
 * @Enumerated -> It's used to map an enum value to and from its database representation.
 */
@Entity
@Table(name = "PG_Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role() {

    }

    public Role(ERole name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
