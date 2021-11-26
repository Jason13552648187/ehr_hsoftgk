package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacDayOff;
import cn.ibizlab.ehr.webapi.dto.VacDayOffDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacDayOffMappingImpl implements VacDayOffMapping {

    @Override
    public VacDayOff toDomain(VacDayOffDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacDayOff vacDayOff = new VacDayOff();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacDayOff.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacDayOff.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVacdayoffname() != null ) {
            vacDayOff.setVacdayoffname( dto.getVacdayoffname() );
        }
        if ( dto.getKssj() != null ) {
            vacDayOff.setKssj( dto.getKssj() );
        }
        if ( dto.getJssj() != null ) {
            vacDayOff.setJssj( dto.getJssj() );
        }
        if ( dto.getCreatedate() != null ) {
            vacDayOff.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacDayOff.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacDayOff.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getVacdayoffid() != null ) {
            vacDayOff.setVacdayoffid( dto.getVacdayoffid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacDayOff.setUpdatedate( dto.getUpdatedate() );
        }

        return vacDayOff;
    }

    @Override
    public VacDayOffDTO toDto(VacDayOff entity) {
        if ( entity == null ) {
            return null;
        }

        VacDayOffDTO vacDayOffDTO = new VacDayOffDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacDayOffDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacDayOffDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVacdayoffname() != null ) {
            vacDayOffDTO.setVacdayoffname( entity.getVacdayoffname() );
        }
        if ( entity.getKssj() != null ) {
            vacDayOffDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getJssj() != null ) {
            vacDayOffDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getCreatedate() != null ) {
            vacDayOffDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacDayOffDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacDayOffDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getVacdayoffid() != null ) {
            vacDayOffDTO.setVacdayoffid( entity.getVacdayoffid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacDayOffDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return vacDayOffDTO;
    }

    @Override
    public List<VacDayOff> toDomain(List<VacDayOffDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacDayOff> list = new ArrayList<VacDayOff>( dtoList.size() );
        for ( VacDayOffDTO vacDayOffDTO : dtoList ) {
            list.add( toDomain( vacDayOffDTO ) );
        }

        return list;
    }

    @Override
    public List<VacDayOffDTO> toDto(List<VacDayOff> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacDayOffDTO> list = new ArrayList<VacDayOffDTO>( entityList.size() );
        for ( VacDayOff vacDayOff : entityList ) {
            list.add( toDto( vacDayOff ) );
        }

        return list;
    }
}
