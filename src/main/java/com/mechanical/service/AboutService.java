package com.mechanical.service;

import com.mechanical.model.AboutModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AboutService {

    AboutModel findAbout();
}
