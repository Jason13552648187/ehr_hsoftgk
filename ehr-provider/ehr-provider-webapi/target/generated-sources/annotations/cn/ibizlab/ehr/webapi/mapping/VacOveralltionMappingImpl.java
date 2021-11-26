package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacOveralltion;
import cn.ibizlab.ehr.webapi.dto.VacOveralltionDTO;
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
public class VacOveralltionMappingImpl implements VacOveralltionMapping {

    @Override
    public VacOveralltion toDomain(VacOveralltionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacOveralltion vacOveralltion = new VacOveralltion();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacOveralltion.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacOveralltion.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXjlx() != null ) {
            vacOveralltion.setXjlx( dto.getXjlx() );
        }
        if ( dto.getJssj() != null ) {
            vacOveralltion.setJssj( dto.getJssj() );
        }
        if ( dto.getKcxjts() != null ) {
            vacOveralltion.setKcxjts( dto.getKcxjts() );
        }
        if ( dto.getVacoveralltionname() != null ) {
            vacOveralltion.setVacoveralltionname( dto.getVacoveralltionname() );
        }
        if ( dto.getKssj() != null ) {
            vacOveralltion.setKssj( dto.getKssj() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacOveralltion.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            vacOveralltion.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            vacOveralltion.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacOveralltion.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacOveralltion.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            vacOveralltion.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            vacOveralltion.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getVacoveralltionid() != null ) {
            vacOveralltion.setVacoveralltionid( dto.getVacoveralltionid() );
        }
        if ( dto.getPimpersonname() != null ) {
            vacOveralltion.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgname() != null ) {
            vacOveralltion.setOrmorgname( dto.getOrmorgname() );
        }

        return vacOveralltion;
    }

    @Override
    public VacOveralltionDTO toDto(VacOveralltion entity) {
        if ( entity == null ) {
            return null;
        }

        VacOveralltionDTO vacOveralltionDTO = new VacOveralltionDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacOveralltionDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacOveralltionDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXjlx() != null ) {
            vacOveralltionDTO.setXjlx( entity.getXjlx() );
        }
        if ( entity.getJssj() != null ) {
            vacOveralltionDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getKcxjts() != null ) {
            vacOveralltionDTO.setKcxjts( entity.getKcxjts() );
        }
        if ( entity.getVacoveralltionname() != null ) {
            vacOveralltionDTO.setVacoveralltionname( entity.getVacoveralltionname() );
        }
        if ( entity.getKssj() != null ) {
            vacOveralltionDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacOveralltionDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            vacOveralltionDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            vacOveralltionDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacOveralltionDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacOveralltionDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            vacOveralltionDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            vacOveralltionDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getVacoveralltionid() != null ) {
            vacOveralltionDTO.setVacoveralltionid( entity.getVacoveralltionid() );
        }
        if ( entity.getPimpersonname() != null ) {
            vacOveralltionDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgname() != null ) {
            vacOveralltionDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return vacOveralltionDTO;
    }

    @Override
    public List<VacOveralltion> toDomain(List<VacOveralltionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacOveralltion> list = new ArrayList<VacOveralltion>( dtoList.size() );
        for ( VacOveralltionDTO vacOveralltionDTO : dtoList ) {
            list.add( toDomain( vacOveralltionDTO ) );
        }

        return list;
    }

    @Override
    public List<VacOveralltionDTO> toDto(List<VacOveralltion> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacOveralltionDTO> list = new ArrayList<VacOveralltionDTO>( entityList.size() );
        for ( VacOveralltion vacOveralltion : entityList ) {
            list.add( toDto( vacOveralltion ) );
        }

        return list;
    }
}
