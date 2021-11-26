package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalPlan;
import cn.ibizlab.ehr.webapi.dto.SalPlanDTO;
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
public class SalPlanMappingImpl implements SalPlanMapping {

    @Override
    public SalPlan toDomain(SalPlanDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalPlan salPlan = new SalPlan();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salPlan.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salPlan.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNyear() != null ) {
            salPlan.setNyear( dto.getNyear() );
        }
        if ( dto.getSalplanname() != null ) {
            salPlan.setSalplanname( dto.getSalplanname() );
        }
        if ( dto.getNmonth() != null ) {
            salPlan.setNmonth( dto.getNmonth() );
        }
        if ( dto.getState() != null ) {
            salPlan.setState( dto.getState() );
        }
        if ( dto.getMemo() != null ) {
            salPlan.setMemo( dto.getMemo() );
        }
        if ( dto.getOrmorgid() != null ) {
            salPlan.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getSalschemeid() != null ) {
            salPlan.setSalschemeid( dto.getSalschemeid() );
        }
        if ( dto.getCreateman() != null ) {
            salPlan.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salPlan.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            salPlan.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSalplanid() != null ) {
            salPlan.setSalplanid( dto.getSalplanid() );
        }
        if ( dto.getEnable() != null ) {
            salPlan.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            salPlan.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalschemename() != null ) {
            salPlan.setSalschemename( dto.getSalschemename() );
        }
        if ( dto.getOrmorgname() != null ) {
            salPlan.setOrmorgname( dto.getOrmorgname() );
        }

        return salPlan;
    }

    @Override
    public SalPlanDTO toDto(SalPlan entity) {
        if ( entity == null ) {
            return null;
        }

        SalPlanDTO salPlanDTO = new SalPlanDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salPlanDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salPlanDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNyear() != null ) {
            salPlanDTO.setNyear( entity.getNyear() );
        }
        if ( entity.getSalplanname() != null ) {
            salPlanDTO.setSalplanname( entity.getSalplanname() );
        }
        if ( entity.getNmonth() != null ) {
            salPlanDTO.setNmonth( entity.getNmonth() );
        }
        if ( entity.getState() != null ) {
            salPlanDTO.setState( entity.getState() );
        }
        if ( entity.getMemo() != null ) {
            salPlanDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getOrmorgid() != null ) {
            salPlanDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getSalschemeid() != null ) {
            salPlanDTO.setSalschemeid( entity.getSalschemeid() );
        }
        if ( entity.getCreateman() != null ) {
            salPlanDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salPlanDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            salPlanDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSalplanid() != null ) {
            salPlanDTO.setSalplanid( entity.getSalplanid() );
        }
        if ( entity.getEnable() != null ) {
            salPlanDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            salPlanDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalschemename() != null ) {
            salPlanDTO.setSalschemename( entity.getSalschemename() );
        }
        if ( entity.getOrmorgname() != null ) {
            salPlanDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salPlanDTO;
    }

    @Override
    public List<SalPlan> toDomain(List<SalPlanDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalPlan> list = new ArrayList<SalPlan>( dtoList.size() );
        for ( SalPlanDTO salPlanDTO : dtoList ) {
            list.add( toDomain( salPlanDTO ) );
        }

        return list;
    }

    @Override
    public List<SalPlanDTO> toDto(List<SalPlan> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalPlanDTO> list = new ArrayList<SalPlanDTO>( entityList.size() );
        for ( SalPlan salPlan : entityList ) {
            list.add( toDto( salPlan ) );
        }

        return list;
    }
}
