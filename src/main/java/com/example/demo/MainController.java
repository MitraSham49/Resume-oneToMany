package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {


    @Autowired
    PersonRepository PersonRep;

    @Autowired
    WorkRepository workRep;

    @Autowired
    EducationRepository eduRep;

    @Autowired
    SkillsRepository skillRep;

    @RequestMapping("/")
    public String showIndex(Model model)
    {
        //Check the database as soon as you run this route. This should be the first thing that you do.
        model.addAttribute("allpersons",PersonRep.findAll());
        return "index";
    }

    @RequestMapping("/addperson")
    public  String addPerson(Model model){
        model.addAttribute( "aPerson", new Person());
        return"addperson" ;
    }

    @RequestMapping("/saveperson")
    public  String savePerson(@Valid @ModelAttribute("aPerson") Person toSave, BindingResult result){
        if (result.hasErrors()){
            return"addperson";
        }

        PersonRep.save (toSave);
        return "redirect:/";
    }

    @RequestMapping("/addskill")
    public  String addSkill(Model model){
        model.addAttribute( "aSkill", new Skills());
        return"addskill" ;
    }

    @RequestMapping("/saveskill")
    public  String saveSkills (@Valid @ModelAttribute ("aSkill") Skills skill, BindingResult result){
        if (result.hasErrors()){
            return"addskill";
        }

        skillRep.save (skill);
        return "redirect:/";
    }



    @RequestMapping("/addeducation")
    public  String addEducation(Model model){
        model.addAttribute( "aEducation", new Education());
        return"addeducation" ;
    }

    @RequestMapping("/saveeducation")
    public  String saveeducation (@Valid @ModelAttribute ("aEducation") Education education, BindingResult result){
        if (result.hasErrors()){
            return"addeducation";
        }

        eduRep.save (education);
        return "redirect:/";
    }

// add some command for test

    @RequestMapping("/addwork")
    public  String addwork(Model model){
        model.addAttribute( "aWork", new Work());
        return"addwork" ;
    }

    @RequestMapping("/savework")
    public  String saveeducation (@Valid @ModelAttribute ("aWork") Work work, BindingResult result){
        if (result.hasErrors()){
            return"addwork";
        }

        workRep.save (work);
        return "redirect:/";
    }


    @RequestMapping("/addskillform")
    public String addSkilToForm(Model model)
    {
        model.addAttribute("aSkill",new Skills());
        model.addAttribute("allpersons",PersonRep.findAll());
        return "addskillform";
    }



    @RequestMapping("/addworkform")
    public String addWorkToForm(Model model)
    {
        model.addAttribute("aWork",new Work());
        model.addAttribute("allpersons",PersonRep.findAll());
        return "addworkform";
    }


    @RequestMapping("/addeduform")
    public String addeduToForm(Model model)
    {
        model.addAttribute("aEducation",new Education());
        model.addAttribute("allpersons",PersonRep.findAll());
        return "addeduform";
    }

}
