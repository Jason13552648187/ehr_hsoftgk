package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalItemSub;
import cn.ibizlab.ehr.webapi.dto.SalItemSubDTO;
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
public class SalItemSubMappingImpl implements SalItemSubMapping {

    @Override
    public SalItemSub toDomain(SalItemSubDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalItemSub salItemSub = new SalItemSub();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salItemSub.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salItemSub.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalitemsubname() != null ) {
            salItemSub.setSalitemsubname( dto.getSalitemsubname() );
        }
        if ( dto.getOrmorgid() != null ) {
            salItemSub.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getSalsubjectid() != null ) {
            salItemSub.setSalsubjectid( dto.getSalsubjectid() );
        }
        if ( dto.getSalitemid() != null ) {
            salItemSub.setSalitemid( dto.getSalitemid() );
        }
        if ( dto.getCreateman() != null ) {
            salItemSub.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salItemSub.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSalitemsubid() != null ) {
            salItemSub.setSalitemsubid( dto.getSalitemsubid() );
        }
        if ( dto.getUpdateman() != null ) {
            salItemSub.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salItemSub.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            salItemSub.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getSalitemname() != null ) {
            salItemSub.setSalitemname( dto.getSalitemname() );
        }
        if ( dto.getSalsubjectname() != null ) {
            salItemSub.setSalsubjectname( dto.getSalsubjectname() );
        }

        return salItemSub;
    }

    @Override
    public SalItemSubDTO toDto(SalItemSub entity) {
        if ( entity == null ) {
            return null;
        }

        SalItemSubDTO salItemSubDTO = new SalItemSubDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salItemSubDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salItemSubDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalitemsubname() != null ) {
            salItemSubDTO.setSalitemsubname( entity.getSalitemsubname() );
        }
        if ( entity.getOrmorgid() != null ) {
            salItemSubDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getSalsubjectid() != null ) {
            salItemSubDTO.setSalsubjectid( entity.getSalsubjectid() );
        }
        if ( entity.getSalitemid() != null ) {
            salItemSubDTO.setSalitemid( entity.getSalitemid() );
        }
        if ( entity.getCreateman() != null ) {
            salItemSubDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salItemSubDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSalitemsubid() != null ) {
            salItemSubDTO.setSalitemsubid( entity.getSalitemsubid() );
        }
        if ( entity.getUpdateman() != null ) {
            salItemSubDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salItemSubDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            salItemSubDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getSalitemname() != null ) {
            salItemSubDTO.setSalitemname( entity.getSalitemname() );
        }
        if ( entity.getSalsubjectname() != null ) {
            salItemSubDTO.setSalsubjectname( entity.getSalsubjectname() );
        }

        return salItemSubDTO;
    }

    @Override
    public List<SalItemSub> toDomain(List<SalItemSubDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalItemSub> list = new ArrayList<SalItemSub>( dtoList.size() );
        for ( SalItemSubDTO salItemSubDTO : dtoList ) {
            list.add( toDomain( salItemSubDTO ) );
        }

        return list;
    }

    @Override
    public List<SalItemSubDTO> toDto(List<SalItemSub> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalItemSubDTO> list = new ArrayList<SalItemSubDTO>( entityList.size() );
        for ( SalItemSub salItemSub : entityList ) {
            list.add( toDto( salItemSub ) );
        }

        return list;
    }
}
