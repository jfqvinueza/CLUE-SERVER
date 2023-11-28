package com.groupfour.clueserver.purchaseList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Controlador purchaseList (purchaseLists)", description = "Tabla purchaseLists")
@RestController
@RequestMapping("/app/purchaseList")
@CrossOrigin({"*"})
public class PurchaseListController {
        //Consumir el servicio
    @Autowired
    private PurchaseListService purchaseListService;

    //Sub ruta para el create
    @Operation(summary = "Guarda un nuevo rol (enviado en el body), Requiere purchaseList_Write")    
    @PreAuthorize("hasAuthority('purchaseList_Write')")
    @PostMapping("/create")
    public PurchaseListModel save(@RequestBody PurchaseListModel entity)
    {
        return purchaseListService.save(entity);
    }

    //Sub ruta para el read
        @Operation(summary = "Obtiene un rol por su id, Requiere purchaseList_Read")
    @PreAuthorize("hasAuthority('purchaseList_Read')")
    @GetMapping("/{id}")
    public PurchaseListModel read(@PathVariable Integer id)
    {
        return purchaseListService.findById(id);
    }

    //Sub ruta para el update
    @Operation(summary = "Actualiza un rol por su id, Requiere purchaseList_Write")
    @PreAuthorize("hasAuthority('purchaseList_Write')")
    @PutMapping("/{id}")
    public PurchaseListModel update(@RequestBody PurchaseListModel entity)
    {
        return purchaseListService.save(entity);
    }

    //Sub ruta para el delete
    @Operation(summary = "Borra un rol por su id, Requiere purchaseList_Delete")
    @PreAuthorize("hasAuthority('purchaseList_Delete')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        purchaseListService.deleteById(id);
    }

    //Sub ruta para el read all
    @Operation(summary = "Obtiene un listado de todos los purchaseLists, Requiere purchaseList_Read")
    @PreAuthorize("hasAuthority('purchaseList_Read')")
    @GetMapping("/")
    public List<PurchaseListModel> findAll()
    {
        return purchaseListService.findAll();
    }
}
