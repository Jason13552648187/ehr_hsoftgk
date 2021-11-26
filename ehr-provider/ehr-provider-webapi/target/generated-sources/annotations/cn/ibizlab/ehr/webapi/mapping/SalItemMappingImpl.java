package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalItem;
import cn.ibizlab.ehr.webapi.dto.SalItemDTO;
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
public class SalItemMappingImpl implements SalItemMapping {

    @Override
    public SalItem toDomain(SalItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalItem salItem = new SalItem();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salItem.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salItem.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalitemname() != null ) {
            salItem.setSalitemname( dto.getSalitemname() );
        }
        if ( dto.getXh() != null ) {
            salItem.setXh( dto.getXh() );
        }
        if ( dto.getSalsubjectid() != null ) {
            salItem.setSalsubjectid( dto.getSalsubjectid() );
        }
        if ( dto.getEnable() != null ) {
            salItem.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            salItem.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            salItem.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salItem.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            salItem.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalitemid() != null ) {
            salItem.setSalitemid( dto.getSalitemid() );
        }
        if ( dto.getSalsubjectname() != null ) {
            salItem.setSalsubjectname( dto.getSalsubjectname() );
        }

        return salItem;
    }

    @Override
    public SalItemDTO toDto(SalItem entity) {
        if ( entity == null ) {
            return null;
        }

        SalItemDTO salItemDTO = new SalItemDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salItemDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salItemDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalitemname() != null ) {
            salItemDTO.setSalitemname( entity.getSalitemname() );
        }
        if ( entity.getXh() != null ) {
            salItemDTO.setXh( entity.getXh() );
        }
        if ( entity.getSalsubjectid() != null ) {
            salItemDTO.setSalsubjectid( entity.getSalsubjectid() );
        }
        if ( entity.getEnable() != null ) {
            salItemDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            salItemDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            salItemDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salItemDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            salItemDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalitemid() != null ) {
            salItemDTO.setSalitemid( entity.getSalitemid() );
        }
        if ( entity.getSalsubjectname() != null ) {
            salItemDTO.setSalsubjectname( entity.getSalsubjectname() );
        }

        return salItemDTO;
    }

    @Override
    public List<SalItem> toDomain(List<SalItemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalItem> list = new ArrayList<SalItem>( dtoList.size() );
        for ( SalItemDTO salItemDTO : dtoList ) {
            list.add( toDomain( salItemDTO ) );
        }

        return list;
    }

    @Override
    public List<SalItemDTO> toDto(List<SalItem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalItemDTO> list = new ArrayList<SalItemDTO>( entityList.size() );
        for ( SalItem salItem : entityList ) {
            list.add( toDto( salItem ) );
        }

        return list;
    }
}
