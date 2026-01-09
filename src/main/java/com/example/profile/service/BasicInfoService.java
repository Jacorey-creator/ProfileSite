package com.example.profile.service;

import org.springframework.stereotype.Service;

import com.example.profile.model.BasicInformation;

@Service
public class BasicInfoService {
    public BasicInformation getInfo()
    {
        String introBlock =     
        """
        Hello I'm <strong>Jacorey!</strong> I am a <strong>Software/Game Developer</strong>.
        Professionally, my preferred coding language is <strong>C#</strong> due to its <strong>Unity</strong> compatibility.
        I am eagerly looking towards working in Software Development.
        My passions lie with playing video games such as Gunfire Reborn and classics like Mario.
        """;

        return new BasicInformation(
            "Jacorey Rowe", 
            introBlock,
            "/images/Fancy1.jpg"
        );
    }
}
