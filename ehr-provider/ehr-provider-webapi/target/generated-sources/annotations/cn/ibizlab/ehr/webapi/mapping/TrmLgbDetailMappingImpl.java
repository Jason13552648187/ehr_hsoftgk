package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmLgbDetail;
import cn.ibizlab.ehr.webapi.dto.TrmLgbDetailDTO;
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
    date = "2021-09-04T00:31:44+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmLgbDetailMappingImpl implements TrmLgbDetailMapping {

    @Override
    public TrmLgbDetail toDomain(TrmLgbDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmLgbDetail trmLgbDetail = new TrmLgbDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmLgbDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmLgbDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTrmlgbdetailname() != null ) {
            trmLgbDetail.setTrmlgbdetailname( dto.getTrmlgbdetailname() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmLgbDetail.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getTrmlgbcostid() != null ) {
            trmLgbDetail.setTrmlgbcostid( dto.getTrmlgbcostid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmLgbDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmLgbDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            trmLgbDetail.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            trmLgbDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTrmlgbdetailid() != null ) {
            trmLgbDetail.setTrmlgbdetailid( dto.getTrmlgbdetailid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmLgbDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmLgbDetail.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getTrmlgbcostname() != null ) {
            trmLgbDetail.setTrmlgbcostname( dto.getTrmlgbcostname() );
        }
        if ( dto.getZjhm() != null ) {
            trmLgbDetail.setZjhm( dto.getZjhm() );
        }

        return trmLgbDetail;
    }

    @Override
    public TrmLgbDetailDTO toDto(TrmLgbDetail entity) {
        if ( entity == null ) {
            return null;
        }

        TrmLgbDetailDTO trmLgbDetailDTO = new TrmLgbDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmLgbDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmLgbDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTrmlgbdetailname() != null ) {
            trmLgbDetailDTO.setTrmlgbdetailname( entity.getTrmlgbdetailname() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmLgbDetailDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getTrmlgbcostid() != null ) {
            trmLgbDetailDTO.setTrmlgbcostid( entity.getTrmlgbcostid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmLgbDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmLgbDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            trmLgbDetailDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            trmLgbDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTrmlgbdetailid() != null ) {
            trmLgbDetailDTO.setTrmlgbdetailid( entity.getTrmlgbdetailid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmLgbDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmLgbDetailDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getTrmlgbcostname() != null ) {
            trmLgbDetailDTO.setTrmlgbcostname( entity.getTrmlgbcostname() );
        }
        if ( entity.getZjhm() != null ) {
            trmLgbDetailDTO.setZjhm( entity.getZjhm() );
        }

        return trmLgbDetailDTO;
    }

    @Override
    public List<TrmLgbDetail> toDomain(List<TrmLgbDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmLgbDetail> list = new ArrayList<TrmLgbDetail>( dtoList.size() );
        for ( TrmLgbDetailDTO trmLgbDetailDTO : dtoList ) {
            list.add( toDomain( trmLgbDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmLgbDetailDTO> toDto(List<TrmLgbDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmLgbDetailDTO> list = new ArrayList<TrmLgbDetailDTO>( entityList.size() );
        for ( TrmLgbDetail trmLgbDetail : entityList ) {
            list.add( toDto( trmLgbDetail ) );
        }

        return list;
    }
}
