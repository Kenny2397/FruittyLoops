package com.codingdojo.kenny.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.kenny.modelos.ModeloItem;

@Controller
public class ControladorItem {
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) {
        
        ArrayList<ModeloItem> fruits = new ArrayList<ModeloItem>();
        fruits.add(new ModeloItem("Kiwi", 1.5));
        fruits.add(new ModeloItem("Mango", 2.0));
        fruits.add(new ModeloItem("Bayas de Goji", 4.0));
        fruits.add(new ModeloItem("Guayava", .75));
        
        // Agrega frutas a tu modelo de vista aquí
        model.addAttribute("fruits", fruits);
        
        
        return "index.jsp";
    }
	
}
