package com.company.controller;

import com.company.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    //    Mapping to the page for adding to activity form
    @RequestMapping("addActivity")
    public ModelAndView addActivity() {

        return new
                ModelAndView("addActivity", "message", "");
    }

    //    Mapping to add food venue to database
    @RequestMapping("addFood")
    public ModelAndView getForm(@RequestParam("name") String name,
                                @RequestParam("address") String address,
                                @RequestParam("website") String website,
                                @RequestParam("stationId") int stationId) {

        Session session = getSession();
        Transaction tx = session.beginTransaction();

        FoodEntity newFood = new FoodEntity();

        newFood.setName(name);
        newFood.setAddress(address);
        newFood.setWebsite(website);
        newFood.setStationId(stationId);

        session.save(newFood);
        tx.commit();
        session.close();

        return new
                ModelAndView("confirmpage", "message", "Thank you for submitting");
    }

    //
    @RequestMapping("addRetail")

    public ModelAndView getForm1(@RequestParam("name") String name,
                                 @RequestParam("address") String address,
                                 @RequestParam("website") String website,
                                 @RequestParam("stationId") int stationId) {

        Session session = getSession();
        Transaction tx = session.beginTransaction();

        RetailEntity newRetail = new RetailEntity();

        newRetail.setName(name);
        newRetail.setAddress(address);
        newRetail.setWebsite(website);
        newRetail.setStationId(stationId);

        session.save(newRetail);
        tx.commit();
        session.close();

        return new
                ModelAndView("confirmpage", "message", "Thank you for submitting");
    }

    @RequestMapping("addEntertainment")
    public ModelAndView getForm2(@RequestParam("name") String name,
                                 @RequestParam("address") String address,
                                 @RequestParam("website") String website,
                                 @RequestParam("stationId") int stationId) {

        Session session = getSession();
        Transaction tx = session.beginTransaction();

        EntertainmentEntity newEntertainment = new EntertainmentEntity();

        newEntertainment.setName(name);
        newEntertainment.setAddress(address);
        newEntertainment.setWebsite(website);
        newEntertainment.setStationId(stationId);

        session.save(newEntertainment);
        tx.commit();
        session.close();

        return new
                ModelAndView("confirmpage", "message", "Thank you for submitting");
    }

    @RequestMapping("addLodging")
    public ModelAndView getForm3(@RequestParam("name") String name,
                                 @RequestParam("address") String address,
                                 @RequestParam("website") String website,
                                 @RequestParam("stationId") int stationId) {

        Session session = getSession();
        Transaction tx = session.beginTransaction();

        LodgingEntity newLodging = new LodgingEntity();

        newLodging.setName(name);
        newLodging.setAddress(address);
        newLodging.setWebsite(website);
        newLodging.setStationId(stationId);

        session.save(newLodging);
        tx.commit();
        session.close();

        return new
                ModelAndView("confirmpage", "message", "Thank you for submitting");
    }

    //making a generic session
    private Session getSession() {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory.openSession();
    }

    @RequestMapping("newUser")
    public ModelAndView newUser() {

        return new
                ModelAndView("newUser", "message", "");
    }

    @RequestMapping("addUser")
    public ModelAndView getForm3(@RequestParam("userLogin") String userLogin,
                                 @RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName,
                                 @RequestParam("phoneNumber") String phoneNumber,
                                 @RequestParam("password") String password) {

        Session session = getSession();
        Transaction tx = session.beginTransaction();

        UserinfoEntity newUser = new UserinfoEntity();

        newUser.setUserLogin(userLogin);
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setPhoneNumber(phoneNumber);
        newUser.setPassword(password);

        session.save(newUser);
        tx.commit();
        session.close();

        return new
                ModelAndView("confirmpage", "message", "Thank you for registering");
    }

}