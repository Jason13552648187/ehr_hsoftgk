package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacSystemApplication;
import cn.ibizlab.ehr.webapi.dto.VacSystemApplicationDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacSystemApplicationMappingImpl implements VacSystemApplicationMapping {

    @Override
    public VacSystemApplication toDomain(VacSystemApplicationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacSystemApplication vacSystemApplication = new VacSystemApplication();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacSystemApplication.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacSystemApplication.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVacsystemapplicationname() != null ) {
            vacSystemApplication.setVacsystemapplicationname( dto.getVacsystemapplicationname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            vacSystemApplication.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getVacleavesystemid() != null ) {
            vacSystemApplication.setVacleavesystemid( dto.getVacleavesystemid() );
        }
        if ( dto.getPimpersonid() != null ) {
            vacSystemApplication.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            vacSystemApplication.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            vacSystemApplication.setEnable( dto.getEnable() );
        }
        if ( dto.getVacsystemapplicationid() != null ) {
            vacSystemApplication.setVacsystemapplicationid( dto.getVacsystemapplicationid() );
        }
        if ( dto.getUpdateman() != null ) {
            vacSystemApplication.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacSystemApplication.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            vacSystemApplication.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getVacleavesystemname() != null ) {
            vacSystemApplication.setVacleavesystemname( dto.getVacleavesystemname() );
        }
        if ( dto.getPimpersonname() != null ) {
            vacSystemApplication.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            vacSystemApplication.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return vacSystemApplication;
    }

    @Override
    public VacSystemApplicationDTO toDto(VacSystemApplication entity) {
        if ( entity == null ) {
            return null;
        }

        VacSystemApplicationDTO vacSystemApplicationDTO = new VacSystemApplicationDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacSystemApplicationDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacSystemApplicationDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVacsystemapplicationname() != null ) {
            vacSystemApplicationDTO.setVacsystemapplicationname( entity.getVacsystemapplicationname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            vacSystemApplicationDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getVacleavesystemid() != null ) {
            vacSystemApplicationDTO.setVacleavesystemid( entity.getVacleavesystemid() );
        }
        if ( entity.getPimpersonid() != null ) {
            vacSystemApplicationDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            vacSystemApplicationDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            vacSystemApplicationDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getVacsystemapplicationid() != null ) {
            vacSystemApplicationDTO.setVacsystemapplicationid( entity.getVacsystemapplicationid() );
        }
        if ( entity.getUpdateman() != null ) {
            vacSystemApplicationDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacSystemApplicationDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            vacSystemApplicationDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getVacleavesystemname() != null ) {
            vacSystemApplicationDTO.setVacleavesystemname( entity.getVacleavesystemname() );
        }
        if ( entity.getPimpersonname() != null ) {
            vacSystemApplicationDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            vacSystemApplicationDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return vacSystemApplicationDTO;
    }

    @Override
    public List<VacSystemApplication> toDomain(List<VacSystemApplicationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacSystemApplication> list = new ArrayList<VacSystemApplication>( dtoList.size() );
        for ( VacSystemApplicationDTO vacSystemApplicationDTO : dtoList ) {
            list.add( toDomain( vacSystemApplicationDTO ) );
        }

        return list;
    }

    @Override
    public List<VacSystemApplicationDTO> toDto(List<VacSystemApplication> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacSystemApplicationDTO> list = new ArrayList<VacSystemApplicationDTO>( entityList.size() );
        for ( VacSystemApplication vacSystemApplication : entityList ) {
            list.add( toDto( vacSystemApplication ) );
        }

        return list;
    }
}
