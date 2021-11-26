package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmLgbCost;
import cn.ibizlab.ehr.webapi.dto.TrmLgbCostDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmLgbCostMappingImpl implements TrmLgbCostMapping {

    @Override
    public TrmLgbCost toDomain(TrmLgbCostDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmLgbCost trmLgbCost = new TrmLgbCost();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmLgbCost.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmLgbCost.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKssj() != null ) {
            trmLgbCost.setKssj( dto.getKssj() );
        }
        if ( dto.getJssj() != null ) {
            trmLgbCost.setJssj( dto.getJssj() );
        }
        if ( dto.getJe() != null ) {
            trmLgbCost.setJe( dto.getJe() );
        }
        if ( dto.getHdsm() != null ) {
            trmLgbCost.setHdsm( dto.getHdsm() );
        }
        if ( dto.getTrmlgbcostname() != null ) {
            trmLgbCost.setTrmlgbcostname( dto.getTrmlgbcostname() );
        }
        if ( dto.getMemo() != null ) {
            trmLgbCost.setMemo( dto.getMemo() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmLgbCost.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmLgbCost.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            trmLgbCost.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmLgbCost.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            trmLgbCost.setEnable( dto.getEnable() );
        }
        if ( dto.getOrgid() != null ) {
            trmLgbCost.setOrgid( dto.getOrgid() );
        }
        if ( dto.getTrmlgbcostid() != null ) {
            trmLgbCost.setTrmlgbcostid( dto.getTrmlgbcostid() );
        }
        if ( dto.getCreateman() != null ) {
            trmLgbCost.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmLgbCost.setOrmorgname( dto.getOrmorgname() );
        }

        return trmLgbCost;
    }

    @Override
    public TrmLgbCostDTO toDto(TrmLgbCost entity) {
        if ( entity == null ) {
            return null;
        }

        TrmLgbCostDTO trmLgbCostDTO = new TrmLgbCostDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmLgbCostDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmLgbCostDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKssj() != null ) {
            trmLgbCostDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getJssj() != null ) {
            trmLgbCostDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getJe() != null ) {
            trmLgbCostDTO.setJe( entity.getJe() );
        }
        if ( entity.getHdsm() != null ) {
            trmLgbCostDTO.setHdsm( entity.getHdsm() );
        }
        if ( entity.getTrmlgbcostname() != null ) {
            trmLgbCostDTO.setTrmlgbcostname( entity.getTrmlgbcostname() );
        }
        if ( entity.getMemo() != null ) {
            trmLgbCostDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmLgbCostDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmLgbCostDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            trmLgbCostDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmLgbCostDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            trmLgbCostDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrgid() != null ) {
            trmLgbCostDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getTrmlgbcostid() != null ) {
            trmLgbCostDTO.setTrmlgbcostid( entity.getTrmlgbcostid() );
        }
        if ( entity.getCreateman() != null ) {
            trmLgbCostDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmLgbCostDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return trmLgbCostDTO;
    }

    @Override
    public List<TrmLgbCost> toDomain(List<TrmLgbCostDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmLgbCost> list = new ArrayList<TrmLgbCost>( dtoList.size() );
        for ( TrmLgbCostDTO trmLgbCostDTO : dtoList ) {
            list.add( toDomain( trmLgbCostDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmLgbCostDTO> toDto(List<TrmLgbCost> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmLgbCostDTO> list = new ArrayList<TrmLgbCostDTO>( entityList.size() );
        for ( TrmLgbCost trmLgbCost : entityList ) {
            list.add( toDto( trmLgbCost ) );
        }

        return list;
    }
}
