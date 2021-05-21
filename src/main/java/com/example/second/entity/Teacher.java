package com.example.second.entity;

public class Teacher {

    private Long uid;

    private String name;

    private Integer age;

    private String sex;

    //author:zhaohong

    private String birthday;
    private String address;
    private String married;
    private String school;
    private String email;
    private String qq;
    private String wechat;
    private Integer salary;
    private String phone;
    private String cars;//轿车
    private Integer height;//身高
    private Integer weight;//体重
    private String party_member;//是否是党员qq
    private String habits;//学科
    private String college;//学院
    private String pets;//宠物

    public String getMarried() {
        return married;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars == null ? null : cars.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getHabits() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits = habits == null ? null : habits.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets == null ? null : pets.trim();
    }

    public Long getUid() {
        return uid;
    }

    public String getParty_member() {
        return party_member;
    }

    public void setParty_member(String party_member) {
        this.party_member = party_member == null ? null : party_member.trim();
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null:sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday==null ? null : birthday.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public void setMarried(String married) {
        this.married = married == null ? null : married.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getPhone() {
        return phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}
