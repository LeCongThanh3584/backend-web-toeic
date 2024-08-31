package com.backend.spring.service.FreeMaterial;

import com.backend.spring.entity.FreeMaterial;
import com.backend.spring.payload.request.FreeMaterialRequest;

import java.io.IOException;
import java.util.List;

public interface IFreeMaterialService {
    List<FreeMaterial> getAllFreeMaterials();
    FreeMaterial getFreeMaterialById(Integer id);
    FreeMaterial createFreeMaterial(FreeMaterialRequest freeMaterialRequest) throws IOException;
    FreeMaterial updateFreeMaterial(FreeMaterialRequest freeMaterialRequest) throws IOException;
    boolean updateFreeMaterialStatus(Integer freeMaterialId, Integer status);
    boolean deleteFreeMaterial(Integer id) throws IOException;
    long countTotalFreeMaterials();
}