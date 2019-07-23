package com.example.demojpaa.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

//@Data
//@Getter
//@Setter
@Entity
public class Category {

    @Id
    private Integer id;
    @NotNull
    @NotBlank
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private Set<Product> productSet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}