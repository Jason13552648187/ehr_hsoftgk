package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalSchemeItem;
import cn.ibizlab.ehr.webapi.dto.SalSchemeItemDTO;
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
public class SalSchemeItemMappingImpl implements SalSchemeItemMapping {

    @Override
    public SalSchemeItem toDomain(SalSchemeItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalSchemeItem salSchemeItem = new SalSchemeItem();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salSchemeItem.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salSchemeItem.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBz() != null ) {
            salSchemeItem.setBz( dto.getBz() );
        }
        if ( dto.getSitemtype() != null ) {
            salSchemeItem.setSitemtype( dto.getSitemtype() );
        }
        if ( dto.getSalschemeitemname() != null ) {
            salSchemeItem.setSalschemeitemname( dto.getSalschemeitemname() );
        }
        if ( dto.getMemo() != null ) {
            salSchemeItem.setMemo( dto.getMemo() );
        }
        if ( dto.getGs() != null ) {
            salSchemeItem.setGs( dto.getGs() );
        }
        if ( dto.getSitemadd() != null ) {
            salSchemeItem.setSitemadd( dto.getSitemadd() );
        }
        if ( dto.getXh() != null ) {
            salSchemeItem.setXh( dto.getXh() );
        }
        if ( dto.getSalschemeid() != null ) {
            salSchemeItem.setSalschemeid( dto.getSalschemeid() );
        }
        if ( dto.getSalruleid() != null ) {
            salSchemeItem.setSalruleid( dto.getSalruleid() );
        }
        if ( dto.getSalitemid() != null ) {
            salSchemeItem.setSalitemid( dto.getSalitemid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salSchemeItem.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salSchemeItem.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salSchemeItem.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salSchemeItem.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            salSchemeItem.setEnable( dto.getEnable() );
        }
        if ( dto.getSalschemeitemid() != null ) {
            salSchemeItem.setSalschemeitemid( dto.getSalschemeitemid() );
        }
        if ( dto.getSalschemename() != null ) {
            salSchemeItem.setSalschemename( dto.getSalschemename() );
        }
        if ( dto.getSalrulename() != null ) {
            salSchemeItem.setSalrulename( dto.getSalrulename() );
        }
        if ( dto.getSalitemname() != null ) {
            salSchemeItem.setSalitemname( dto.getSalitemname() );
        }
        if ( dto.getXh2() != null ) {
            salSchemeItem.setXh2( dto.getXh2() );
        }

        return salSchemeItem;
    }

    @Override
    public SalSchemeItemDTO toDto(SalSchemeItem entity) {
        if ( entity == null ) {
            return null;
        }

        SalSchemeItemDTO salSchemeItemDTO = new SalSchemeItemDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salSchemeItemDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salSchemeItemDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBz() != null ) {
            salSchemeItemDTO.setBz( entity.getBz() );
        }
        if ( entity.getSitemtype() != null ) {
            salSchemeItemDTO.setSitemtype( entity.getSitemtype() );
        }
        if ( entity.getSalschemeitemname() != null ) {
            salSchemeItemDTO.setSalschemeitemname( entity.getSalschemeitemname() );
        }
        if ( entity.getMemo() != null ) {
            salSchemeItemDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getGs() != null ) {
            salSchemeItemDTO.setGs( entity.getGs() );
        }
        if ( entity.getSitemadd() != null ) {
            salSchemeItemDTO.setSitemadd( entity.getSitemadd() );
        }
        if ( entity.getXh() != null ) {
            salSchemeItemDTO.setXh( entity.getXh() );
        }
        if ( entity.getSalschemeid() != null ) {
            salSchemeItemDTO.setSalschemeid( entity.getSalschemeid() );
        }
        if ( entity.getSalruleid() != null ) {
            salSchemeItemDTO.setSalruleid( entity.getSalruleid() );
        }
        if ( entity.getSalitemid() != null ) {
            salSchemeItemDTO.setSalitemid( entity.getSalitemid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salSchemeItemDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salSchemeItemDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salSchemeItemDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salSchemeItemDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            salSchemeItemDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSalschemeitemid() != null ) {
            salSchemeItemDTO.setSalschemeitemid( entity.getSalschemeitemid() );
        }
        if ( entity.getSalschemename() != null ) {
            salSchemeItemDTO.setSalschemename( entity.getSalschemename() );
        }
        if ( entity.getSalrulename() != null ) {
            salSchemeItemDTO.setSalrulename( entity.getSalrulename() );
        }
        if ( entity.getSalitemname() != null ) {
            salSchemeItemDTO.setSalitemname( entity.getSalitemname() );
        }
        if ( entity.getXh2() != null ) {
            salSchemeItemDTO.setXh2( entity.getXh2() );
        }

        return salSchemeItemDTO;
    }

    @Override
    public List<SalSchemeItem> toDomain(List<SalSchemeItemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalSchemeItem> list = new ArrayList<SalSchemeItem>( dtoList.size() );
        for ( SalSchemeItemDTO salSchemeItemDTO : dtoList ) {
            list.add( toDomain( salSchemeItemDTO ) );
        }

        return list;
    }

    @Override
    public List<SalSchemeItemDTO> toDto(List<SalSchemeItem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalSchemeItemDTO> list = new ArrayList<SalSchemeItemDTO>( entityList.size() );
        for ( SalSchemeItem salSchemeItem : entityList ) {
            list.add( toDto( salSchemeItem ) );
        }

        return list;
    }
}
