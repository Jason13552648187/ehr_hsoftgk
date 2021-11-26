package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacUseNxjmx;
import cn.ibizlab.ehr.webapi.dto.VacUseNxjmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacUseNxjmxMappingImpl implements VacUseNxjmxMapping {

    @Override
    public VacUseNxjmx toDomain(VacUseNxjmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacUseNxjmx vacUseNxjmx = new VacUseNxjmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacUseNxjmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacUseNxjmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVacsynjcxid() != null ) {
            vacUseNxjmx.setVacsynjcxid( dto.getVacsynjcxid() );
        }
        if ( dto.getNd() != null ) {
            vacUseNxjmx.setNd( dto.getNd() );
        }
        if ( dto.getVacusenxjmxname() != null ) {
            vacUseNxjmx.setVacusenxjmxname( dto.getVacusenxjmxname() );
        }
        if ( dto.getBcnxjts() != null ) {
            vacUseNxjmx.setBcnxjts( dto.getBcnxjts() );
        }
        if ( dto.getQjzl() != null ) {
            vacUseNxjmx.setQjzl( dto.getQjzl() );
        }
        if ( dto.getVacleavedetailid() != null ) {
            vacUseNxjmx.setVacleavedetailid( dto.getVacleavedetailid() );
        }
        if ( dto.getUpdateman() != null ) {
            vacUseNxjmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacUseNxjmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacUseNxjmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getVacusenxjmxid() != null ) {
            vacUseNxjmx.setVacusenxjmxid( dto.getVacusenxjmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacUseNxjmx.setCreatedate( dto.getCreatedate() );
        }

        return vacUseNxjmx;
    }

    @Override
    public VacUseNxjmxDTO toDto(VacUseNxjmx entity) {
        if ( entity == null ) {
            return null;
        }

        VacUseNxjmxDTO vacUseNxjmxDTO = new VacUseNxjmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacUseNxjmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacUseNxjmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVacsynjcxid() != null ) {
            vacUseNxjmxDTO.setVacsynjcxid( entity.getVacsynjcxid() );
        }
        if ( entity.getNd() != null ) {
            vacUseNxjmxDTO.setNd( entity.getNd() );
        }
        if ( entity.getVacusenxjmxname() != null ) {
            vacUseNxjmxDTO.setVacusenxjmxname( entity.getVacusenxjmxname() );
        }
        if ( entity.getBcnxjts() != null ) {
            vacUseNxjmxDTO.setBcnxjts( entity.getBcnxjts() );
        }
        if ( entity.getQjzl() != null ) {
            vacUseNxjmxDTO.setQjzl( entity.getQjzl() );
        }
        if ( entity.getVacleavedetailid() != null ) {
            vacUseNxjmxDTO.setVacleavedetailid( entity.getVacleavedetailid() );
        }
        if ( entity.getUpdateman() != null ) {
            vacUseNxjmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacUseNxjmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacUseNxjmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getVacusenxjmxid() != null ) {
            vacUseNxjmxDTO.setVacusenxjmxid( entity.getVacusenxjmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacUseNxjmxDTO.setCreatedate( entity.getCreatedate() );
        }

        return vacUseNxjmxDTO;
    }

    @Override
    public List<VacUseNxjmx> toDomain(List<VacUseNxjmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacUseNxjmx> list = new ArrayList<VacUseNxjmx>( dtoList.size() );
        for ( VacUseNxjmxDTO vacUseNxjmxDTO : dtoList ) {
            list.add( toDomain( vacUseNxjmxDTO ) );
        }

        return list;
    }

    @Override
    public List<VacUseNxjmxDTO> toDto(List<VacUseNxjmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacUseNxjmxDTO> list = new ArrayList<VacUseNxjmxDTO>( entityList.size() );
        for ( VacUseNxjmx vacUseNxjmx : entityList ) {
            list.add( toDto( vacUseNxjmx ) );
        }

        return list;
    }
}
