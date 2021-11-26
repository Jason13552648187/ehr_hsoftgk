package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacInitnxj;
import cn.ibizlab.ehr.webapi.dto.VacInitnxjDTO;
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
    date = "2021-09-04T00:31:54+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacInitnxjMappingImpl implements VacInitnxjMapping {

    @Override
    public VacInitnxj toDomain(VacInitnxjDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacInitnxj vacInitnxj = new VacInitnxj();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacInitnxj.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacInitnxj.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVacinitnxjname() != null ) {
            vacInitnxj.setVacinitnxjname( dto.getVacinitnxjname() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacInitnxj.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacInitnxj.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            vacInitnxj.setOrgid( dto.getOrgid() );
        }
        if ( dto.getVacinitnxjid() != null ) {
            vacInitnxj.setVacinitnxjid( dto.getVacinitnxjid() );
        }
        if ( dto.getCreateman() != null ) {
            vacInitnxj.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacInitnxj.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacInitnxj.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            vacInitnxj.setOrmorgname( dto.getOrmorgname() );
        }

        return vacInitnxj;
    }

    @Override
    public VacInitnxjDTO toDto(VacInitnxj entity) {
        if ( entity == null ) {
            return null;
        }

        VacInitnxjDTO vacInitnxjDTO = new VacInitnxjDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacInitnxjDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacInitnxjDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVacinitnxjname() != null ) {
            vacInitnxjDTO.setVacinitnxjname( entity.getVacinitnxjname() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacInitnxjDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacInitnxjDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            vacInitnxjDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getVacinitnxjid() != null ) {
            vacInitnxjDTO.setVacinitnxjid( entity.getVacinitnxjid() );
        }
        if ( entity.getCreateman() != null ) {
            vacInitnxjDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacInitnxjDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacInitnxjDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            vacInitnxjDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return vacInitnxjDTO;
    }

    @Override
    public List<VacInitnxj> toDomain(List<VacInitnxjDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacInitnxj> list = new ArrayList<VacInitnxj>( dtoList.size() );
        for ( VacInitnxjDTO vacInitnxjDTO : dtoList ) {
            list.add( toDomain( vacInitnxjDTO ) );
        }

        return list;
    }

    @Override
    public List<VacInitnxjDTO> toDto(List<VacInitnxj> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacInitnxjDTO> list = new ArrayList<VacInitnxjDTO>( entityList.size() );
        for ( VacInitnxj vacInitnxj : entityList ) {
            list.add( toDto( vacInitnxj ) );
        }

        return list;
    }
}
