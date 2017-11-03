/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetc.controller;

import assetc.model.Asset;
import assetc.model.Task;
import assetc.service.AssetService;
import assetc.service.BuildService;
import assetc.validator.BuildFormValidator;
import assetc.validator.AssetFormValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
@RequestMapping(value = "/builds")
public class BuildController {
    
    private final Logger logger = LoggerFactory.getLogger(BuildController.class);

	@Autowired
	BuildFormValidator buildFormValidator;
	
        //Set a form validator
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(buildFormValidator);
	}

	private BuildService buildService;

	@Autowired
	public void setBuildService(BuildService buildService) {
		this.buildService = buildService;
	}

	    
        // list page
        @RequestMapping(value = "/asset", method=GET)
        public String showAllBuild(Model model) {
           // model.addAttribute("assets", buildService.findAllAsset());
            return "assetbuild";
        }
        
    
}












