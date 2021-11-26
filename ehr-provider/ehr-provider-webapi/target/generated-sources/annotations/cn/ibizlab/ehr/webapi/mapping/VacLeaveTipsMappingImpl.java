package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacLeaveTips;
import cn.ibizlab.ehr.webapi.dto.VacLeaveTipsDTO;
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
public class VacLeaveTipsMappingImpl implements VacLeaveTipsMapping {

    @Override
    public VacLeaveTips toDomain(VacLeaveTipsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacLeaveTips vacLeaveTips = new VacLeaveTips();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacLeaveTips.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacLeaveTips.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTips() != null ) {
            vacLeaveTips.setTips( dto.getTips() );
        }
        if ( dto.getQjzl() != null ) {
            vacLeaveTips.setQjzl( dto.getQjzl() );
        }
        if ( dto.getVacleavetipsname() != null ) {
            vacLeaveTips.setVacleavetipsname( dto.getVacleavetipsname() );
        }
        if ( dto.getVacholidayrulesid() != null ) {
            vacLeaveTips.setVacholidayrulesid( dto.getVacholidayrulesid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacLeaveTips.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacLeaveTips.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacLeaveTips.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getVacleavetipsid() != null ) {
            vacLeaveTips.setVacleavetipsid( dto.getVacleavetipsid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacLeaveTips.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getVacholidayrulesname() != null ) {
            vacLeaveTips.setVacholidayrulesname( dto.getVacholidayrulesname() );
        }

        return vacLeaveTips;
    }

    @Override
    public VacLeaveTipsDTO toDto(VacLeaveTips entity) {
        if ( entity == null ) {
            return null;
        }

        VacLeaveTipsDTO vacLeaveTipsDTO = new VacLeaveTipsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacLeaveTipsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacLeaveTipsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTips() != null ) {
            vacLeaveTipsDTO.setTips( entity.getTips() );
        }
        if ( entity.getQjzl() != null ) {
            vacLeaveTipsDTO.setQjzl( entity.getQjzl() );
        }
        if ( entity.getVacleavetipsname() != null ) {
            vacLeaveTipsDTO.setVacleavetipsname( entity.getVacleavetipsname() );
        }
        if ( entity.getVacholidayrulesid() != null ) {
            vacLeaveTipsDTO.setVacholidayrulesid( entity.getVacholidayrulesid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacLeaveTipsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacLeaveTipsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacLeaveTipsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getVacleavetipsid() != null ) {
            vacLeaveTipsDTO.setVacleavetipsid( entity.getVacleavetipsid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacLeaveTipsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getVacholidayrulesname() != null ) {
            vacLeaveTipsDTO.setVacholidayrulesname( entity.getVacholidayrulesname() );
        }

        return vacLeaveTipsDTO;
    }

    @Override
    public List<VacLeaveTips> toDomain(List<VacLeaveTipsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacLeaveTips> list = new ArrayList<VacLeaveTips>( dtoList.size() );
        for ( VacLeaveTipsDTO vacLeaveTipsDTO : dtoList ) {
            list.add( toDomain( vacLeaveTipsDTO ) );
        }

        return list;
    }

    @Override
    public List<VacLeaveTipsDTO> toDto(List<VacLeaveTips> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacLeaveTipsDTO> list = new ArrayList<VacLeaveTipsDTO>( entityList.size() );
        for ( VacLeaveTips vacLeaveTips : entityList ) {
            list.add( toDto( vacLeaveTips ) );
        }

        return list;
    }
}
