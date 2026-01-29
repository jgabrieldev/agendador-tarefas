package com.jgabriel.agendadortarefas.business.mapper;

import com.jgabriel.agendadortarefas.business.dto.TarefasDTO;
import com.jgabriel.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {
    TarefasEntity paraTarefaEntity(TarefasDTO dto);
    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
