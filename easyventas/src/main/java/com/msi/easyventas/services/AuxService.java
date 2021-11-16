package com.msi.easyventas.services;

import com.msi.easyventas.dtos.CantFacturaXFecha;
import com.msi.easyventas.dtos.CantProductosXPedidoDTO;
import com.msi.easyventas.models.*;
import com.msi.easyventas.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class AuxService {

    @Autowired
    TipoDocRepository tipoDocRepository;
    @Autowired
    CiudadRepository ciudadRepository;
    @Autowired
    EmpleadoRepository empleadoRepository;
    @Autowired
    MetodoEntregaRepository entregaRepository;
    @Autowired
    MetodoPagoRepository pagoRepository;
    @Autowired
    iDetallePedidoRepository detallePedidoRepository;
    @Autowired
    iProductoRepository productoRepository;
    @Autowired
    FacturaRepository facturaRepository;

    public List<TipoDoc> findAllTipoDoc() {
        List<TipoDoc> tipoDocs = tipoDocRepository.findAll();
        return tipoDocs;
    }

    public List<Ciudad> findAllCiudad() {
        List<Ciudad> ciudades = ciudadRepository.findAll();
        return ciudades;
    }

    public List<Empleado> findAllEmpleadosWithId(){
        List<Empleado> empleados = empleadoRepository.findAll();
        return empleados;
    }

    public List<FormaEntrega> findAllFormaEntrega(){
        List<FormaEntrega> entregas = entregaRepository.findAll();
        return entregas;
    }

    public List<MetodoPago> findAllMetodoPago(){
        List<MetodoPago> pagos = pagoRepository.findAll();
        return pagos;
    }

    public List<CantProductosXPedidoDTO> findAllReporte1(){
        return detallePedidoRepository.lista();
    }

    public List<CantFacturaXFecha> findAllReporte2(){
        return facturaRepository.lista();
    }
}
