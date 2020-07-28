package com.relationships.domain.OneToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;

    /*
        @Relation OneToMany
        Uni-Directional
     */
    @OneToMany(fetch=FetchType.LAZY,  cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "address_id")
    private Set<Address> address = new HashSet<>();


    public Set<Address> getAddress() {
        return address;
    }

    public void addAddress(Address address) {
        this.address.add(address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
