package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacSituationDetail;
import cn.ibizlab.ehr.webapi.dto.VacSituationDetailDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacSituationDetailMappingImpl implements VacSituationDetailMapping {

    @Override
    public VacSituationDetail toDomain(VacSituationDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacSituationDetail vacSituationDetail = new VacSituationDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacSituationDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacSituationDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXjlx() != null ) {
            vacSituationDetail.setXjlx( dto.getXjlx() );
        }
        if ( dto.getVacsituationdetailname() != null ) {
            vacSituationDetail.setVacsituationdetailname( dto.getVacsituationdetailname() );
        }
        if ( dto.getXjts() != null ) {
            vacSituationDetail.setXjts( dto.getXjts() );
        }
        if ( dto.getCreateman() != null ) {
            vacSituationDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            vacSituationDetail.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacSituationDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            vacSituationDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            vacSituationDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getVacsituationdetailid() != null ) {
            vacSituationDetail.setVacsituationdetailid( dto.getVacsituationdetailid() );
        }

        return vacSituationDetail;
    }

    @Override
    public VacSituationDetailDTO toDto(VacSituationDetail entity) {
        if ( entity == null ) {
            return null;
        }

        VacSituationDetailDTO vacSituationDetailDTO = new VacSituationDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacSituationDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacSituationDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXjlx() != null ) {
            vacSituationDetailDTO.setXjlx( entity.getXjlx() );
        }
        if ( entity.getVacsituationdetailname() != null ) {
            vacSituationDetailDTO.setVacsituationdetailname( entity.getVacsituationdetailname() );
        }
        if ( entity.getXjts() != null ) {
            vacSituationDetailDTO.setXjts( entity.getXjts() );
        }
        if ( entity.getCreateman() != null ) {
            vacSituationDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            vacSituationDetailDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacSituationDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            vacSituationDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            vacSituationDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getVacsituationdetailid() != null ) {
            vacSituationDetailDTO.setVacsituationdetailid( entity.getVacsituationdetailid() );
        }

        return vacSituationDetailDTO;
    }

    @Override
    public List<VacSituationDetail> toDomain(List<VacSituationDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacSituationDetail> list = new ArrayList<VacSituationDetail>( dtoList.size() );
        for ( VacSituationDetailDTO vacSituationDetailDTO : dtoList ) {
            list.add( toDomain( vacSituationDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<VacSituationDetailDTO> toDto(List<VacSituationDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacSituationDetailDTO> list = new ArrayList<VacSituationDetailDTO>( entityList.size() );
        for ( VacSituationDetail vacSituationDetail : entityList ) {
            list.add( toDto( vacSituationDetail ) );
        }

        return list;
    }
}
