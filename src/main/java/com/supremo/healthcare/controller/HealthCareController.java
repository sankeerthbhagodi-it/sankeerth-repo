package com.supremo.healthcare.controller;

import com.supremo.healthcare.dao.HospitalRepository;
import com.supremo.healthcare.dao.RolesRepository;
import com.supremo.healthcare.form.HospitalForm;
import com.supremo.healthcare.model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/")
public class HealthCareController {

    private final static String HOME_URL = "index";

    @Autowired
    private HospitalRepository hospitalRepository;

    @GetMapping
    public String getHomePage(Model model){
        model.addAttribute("hospitalUpdateForm", new HospitalForm());
        return "redirect:home";
    }

    @RequestMapping("/home")
    public String getHospitals(Pageable pageable, Model model) {
        List<Hospital> hospitalModels = hospitalRepository.findAll();
        model.addAttribute("hospitalModels", hospitalModels);
        model.addAttribute("hospitalUpdateForm", new HospitalForm());
        System.out.println("Inside home main method");
        return HOME_URL;
    }

    @RequestMapping(value="/hospitalUpdate", method = RequestMethod.POST)
    public String hospitalUpdateToEdit(@ModelAttribute(value="hospitalUpdateForm") HospitalForm hospitalUpdateForm, Model model) {
        model.addAttribute("hospitalUpdateForm", hospitalUpdateForm);
        return "hospitalUpdateFormPage";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute HospitalForm hospitalUpdateForm) {
        System.out.println("Inside updateHospital");
        System.out.println(hospitalUpdateForm);
        // Update the existing Hospital from DB
        updateHospital(hospitalUpdateForm);

        return "redirect:home";
    }

    @RequestMapping(value="/hospitalDelete", method = RequestMethod.POST)
    public String hospitalDeleteToEdit(@ModelAttribute(value="hospitalUpdateForm") HospitalForm hospitalUpdateForm, Model model) {
        model.addAttribute("hospitalUpdateForm", hospitalUpdateForm);
        return "hospitalDeleteFormPage";
    }

    @PostMapping("/delete")
    public String deleteHospitalFromDB(@ModelAttribute HospitalForm hospitalUpdateForm) {
        System.out.println("Inside updateHospital");
        Integer id = hospitalUpdateForm.getId();
        if(Objects.nonNull(id)) {
            System.out.println(id);
            // Delete the existing Hospital from DB
            deleteHospital(id.toString());
        }

        return "redirect:home";
    }

    private void updateHospital(HospitalForm hospitalUpdateForm) {
        Hospital hospital = getHospitalById(hospitalUpdateForm.getId());
        if(Objects.nonNull(hospital)) {
            // Popuate the values in hospital from form object
            populateHospital(hospital,hospitalUpdateForm);
            // Save the updated Hospital in DB
            hospitalRepository.save(hospital);
            System.out.println("Hospital Updated");
        }
    }

    @RequestMapping(value="/hospitalcreate", method = RequestMethod.GET)
    public String hospitalcreate(@ModelAttribute(value="hospitalUpdateForm") HospitalForm hospitalUpdateForm, Model model) {
        model.addAttribute("hospitalUpdateForm", hospitalUpdateForm);
        return "hospitalCreateFormPage";
    }
    @PostMapping("/create")
    public String createHospital(@ModelAttribute HospitalForm hospitalUpdateForm) {
        System.out.println("Inside createHospital");
        System.out.println(hospitalUpdateForm);
        // Get existing Hospital from DB
        Hospital hospital = new Hospital();
        // Popuate the values in hospital from form object
        populateHospital(hospital,hospitalUpdateForm);
        // Save the updated Hospital in DB
        hospitalRepository.save(hospital);
        System.out.println("Hospital Created");
        return "redirect:home";
    }

    private void deleteHospital(String id) {
        System.out.println("Inside deleteHospital");
        System.out.println(id);
        // Get the record from DB
        Hospital hospital = getHospitalById(Integer.valueOf(id));
        // Remove existing Hospital from DB
        hospitalRepository.delete(hospital);
        System.out.println("Hospital Deleted");
    }

    private void populateHospital(Hospital hospital, HospitalForm hospitalUpdateForm) {
        if(Objects.nonNull(hospital) && Objects.nonNull(hospitalUpdateForm)) {
            hospital.setSerial_number(hospitalUpdateForm.getSerial_number());
            hospital.setHospital_Name(hospitalUpdateForm.getHospital_Name());
            hospital.setSuspected_with_O2(hospitalUpdateForm.getSuspected_with_O2());
            hospital.setSuspected_without_O2(hospitalUpdateForm.getSuspected_without_O2());
            hospital.setPositive_with_O2(hospitalUpdateForm.getPositive_with_O2());
            hospital.setPositive_without_O2(hospitalUpdateForm.getPositive_without_O2());
            hospital.setHdu(hospitalUpdateForm.getHdu());
            hospital.setPositive_icu(hospitalUpdateForm.getPositive_icu());
            hospital.setSari_icu(hospitalUpdateForm.getSari_icu());
        }
    }

    private Hospital getHospitalById(Integer id) {
        Hospital hospital = null;
        List<Hospital> hospitalList = hospitalRepository.findAll();
        for(Hospital hospitalModel : hospitalList) {
            if(id.equals(hospitalModel.getId())){
                hospital = hospitalModel;
                break;
            }
        }
        return hospital;
    }

}
