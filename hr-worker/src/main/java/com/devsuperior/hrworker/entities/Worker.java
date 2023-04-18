package com.devsuperior.hrworker.entities;

import java.io.Serializable;
import java.util.Objects;public class Worker implements Serializable {
    private Long id;
    private String name;
    private Double dailyIncome;

    public Worker(){

    }
    public Worker(Long id, String name, Double dailyIncome) {
        this.id=id;
        this.name=name;
        this.dailyIncome=dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(id, worker.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
