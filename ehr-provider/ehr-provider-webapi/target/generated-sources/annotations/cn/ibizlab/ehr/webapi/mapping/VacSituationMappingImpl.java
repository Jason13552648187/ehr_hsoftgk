package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacSituation;
import cn.ibizlab.ehr.webapi.dto.VacSituationDTO;
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
public class VacSituationMappingImpl implements VacSituationMapping {

    @Override
    public VacSituation toDomain(VacSituationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacSituation vacSituation = new VacSituation();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacSituation.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacSituation.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYyts() != null ) {
            vacSituation.setYyts( dto.getYyts() );
        }
        if ( dto.getVacsituationname() != null ) {
            vacSituation.setVacsituationname( dto.getVacsituationname() );
        }
        if ( dto.getBcts() != null ) {
            vacSituation.setBcts( dto.getBcts() );
        }
        if ( dto.getBnts() != null ) {
            vacSituation.setBnts( dto.getBnts() );
        }
        if ( dto.getSnzrts() != null ) {
            vacSituation.setSnzrts( dto.getSnzrts() );
        }
        if ( dto.getLjsyts() != null ) {
            vacSituation.setLjsyts( dto.getLjsyts() );
        }
        if ( dto.getBnsyts() != null ) {
            vacSituation.setBnsyts( dto.getBnsyts() );
        }
        if ( dto.getZts() != null ) {
            vacSituation.setZts( dto.getZts() );
        }
        if ( dto.getPimpersonid() != null ) {
            vacSituation.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getVacsituationid() != null ) {
            vacSituation.setVacsituationid( dto.getVacsituationid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacSituation.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            vacSituation.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            vacSituation.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            vacSituation.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            vacSituation.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            vacSituation.setPimpersonname( dto.getPimpersonname() );
        }

        return vacSituation;
    }

    @Override
    public VacSituationDTO toDto(VacSituation entity) {
        if ( entity == null ) {
            return null;
        }

        VacSituationDTO vacSituationDTO = new VacSituationDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacSituationDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacSituationDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYyts() != null ) {
            vacSituationDTO.setYyts( entity.getYyts() );
        }
        if ( entity.getVacsituationname() != null ) {
            vacSituationDTO.setVacsituationname( entity.getVacsituationname() );
        }
        if ( entity.getBcts() != null ) {
            vacSituationDTO.setBcts( entity.getBcts() );
        }
        if ( entity.getBnts() != null ) {
            vacSituationDTO.setBnts( entity.getBnts() );
        }
        if ( entity.getSnzrts() != null ) {
            vacSituationDTO.setSnzrts( entity.getSnzrts() );
        }
        if ( entity.getLjsyts() != null ) {
            vacSituationDTO.setLjsyts( entity.getLjsyts() );
        }
        if ( entity.getBnsyts() != null ) {
            vacSituationDTO.setBnsyts( entity.getBnsyts() );
        }
        if ( entity.getZts() != null ) {
            vacSituationDTO.setZts( entity.getZts() );
        }
        if ( entity.getPimpersonid() != null ) {
            vacSituationDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getVacsituationid() != null ) {
            vacSituationDTO.setVacsituationid( entity.getVacsituationid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacSituationDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            vacSituationDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            vacSituationDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            vacSituationDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            vacSituationDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            vacSituationDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return vacSituationDTO;
    }

    @Override
    public List<VacSituation> toDomain(List<VacSituationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacSituation> list = new ArrayList<VacSituation>( dtoList.size() );
        for ( VacSituationDTO vacSituationDTO : dtoList ) {
            list.add( toDomain( vacSituationDTO ) );
        }

        return list;
    }

    @Override
    public List<VacSituationDTO> toDto(List<VacSituation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacSituationDTO> list = new ArrayList<VacSituationDTO>( entityList.size() );
        for ( VacSituation vacSituation : entityList ) {
            list.add( toDto( vacSituation ) );
        }

        return list;
    }
}
