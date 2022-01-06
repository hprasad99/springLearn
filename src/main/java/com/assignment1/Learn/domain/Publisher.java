package com.assignment1.Learn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      
      private String addressLine1;
      private String pubName;
      private String city;
      private String state;
      private String zip;



      public Publisher(){
      }

      public Publisher(String pubName,String addressLine1,String city, String state, String zip) {
            this.pubName = pubName;
            this.addressLine1 = addressLine1;
            this.city = city;
            this.state = state;
            this.zip = zip;
      }

      @Override
      public String toString() {
            return "{" +
                  " id='" + getId() + "'" +
                  ", addressLine1='" + getAddressLine1() + "'" +
                  ", pubName='" + getPubName() + "'" +
                  ", city='" + getCity() + "'" +
                  ", state='" + getState() + "'" +
                  ", zip='" + getZip() + "'" +
                  "}";
      }


      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getAddressLine1() {
            return addressLine1;
      }

      public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
      }

      public String getPubName() {
            return pubName;
      }

      public void setPubName(String pubName) {
            this.pubName = pubName;
      }

      public String getCity() {
            return city;
      }

      public void setCity(String city) {
            this.city = city;
      }

      public String getState() {
            return state;
      }

      public void setState(String state) {
            this.state = state;
      }

      public String getZip() {
            return zip;
      }

      public void setZip(String zip) {
            this.zip = zip;
      }

      @Override
      public boolean equals(Object o){
            if(o == this) return true;
            if(o==null || o.getClass() == getClass()) return false;

            Publisher publisher = (Publisher) o;
            return id!=null? id.equals(publisher.id): publisher.id==null;
      }

      @Override
      public int hashCode(){
            return id!=null?id.hashCode():0;
      }
}
