package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEnmembwes;
import cn.ibizlab.ehr.webapi.dto.AttEnmembwesDTO;
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
public class AttEnmembwesMappingImpl implements AttEnmembwesMapping {

    @Override
    public AttEnmembwes toDomain(AttEnmembwesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEnmembwes attEnmembwes = new AttEnmembwes();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEnmembwes.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEnmembwes.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            attEnmembwes.setXh( dto.getXh() );
        }
        if ( dto.getAttenmembwesname() != null ) {
            attEnmembwes.setAttenmembwesname( dto.getAttenmembwesname() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEnmembwes.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            attEnmembwes.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getAttenmembwesid() != null ) {
            attEnmembwes.setAttenmembwesid( dto.getAttenmembwesid() );
        }
        if ( dto.getCreateman() != null ) {
            attEnmembwes.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            attEnmembwes.setCreatedate( dto.getCreatedate() );
        }

        return attEnmembwes;
    }

    @Override
    public AttEnmembwesDTO toDto(AttEnmembwes entity) {
        if ( entity == null ) {
            return null;
        }

        AttEnmembwesDTO attEnmembwesDTO = new AttEnmembwesDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEnmembwesDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEnmembwesDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            attEnmembwesDTO.setXh( entity.getXh() );
        }
        if ( entity.getAttenmembwesname() != null ) {
            attEnmembwesDTO.setAttenmembwesname( entity.getAttenmembwesname() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEnmembwesDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            attEnmembwesDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getAttenmembwesid() != null ) {
            attEnmembwesDTO.setAttenmembwesid( entity.getAttenmembwesid() );
        }
        if ( entity.getCreateman() != null ) {
            attEnmembwesDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            attEnmembwesDTO.setCreatedate( entity.getCreatedate() );
        }

        return attEnmembwesDTO;
    }

    @Override
    public List<AttEnmembwes> toDomain(List<AttEnmembwesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEnmembwes> list = new ArrayList<AttEnmembwes>( dtoList.size() );
        for ( AttEnmembwesDTO attEnmembwesDTO : dtoList ) {
            list.add( toDomain( attEnmembwesDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEnmembwesDTO> toDto(List<AttEnmembwes> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEnmembwesDTO> list = new ArrayList<AttEnmembwesDTO>( entityList.size() );
        for ( AttEnmembwes attEnmembwes : entityList ) {
            list.add( toDto( attEnmembwes ) );
        }

        return list;
    }
}
