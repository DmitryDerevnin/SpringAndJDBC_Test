package com.epam.services.planned;/*package com.services;

import com.entity.certificate.Certificate;
import com.entity.enrollee.Enrollee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CertificateService {

    //абитуриент сам заполняет свой аттестат
    public void fillCertificate(String schoolSubject, Double score,
                                int numberOfSubjects) {
        Certificate certificate = new Certificate();
        int n = 0;
        while (n < numberOfSubjects) {
            Map<String, Double> map = new HashMap<>();
            map.put(schoolSubject, score);
            certificate.setSchoolSubjects(map);
        }
    }
}
*/