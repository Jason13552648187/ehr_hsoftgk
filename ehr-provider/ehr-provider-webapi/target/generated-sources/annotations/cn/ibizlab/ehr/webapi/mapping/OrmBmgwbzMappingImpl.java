package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmBmgwbz;
import cn.ibizlab.ehr.webapi.dto.OrmBmgwbzDTO;
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
public class OrmBmgwbzMappingImpl implements OrmBmgwbzMapping {

    @Override
    public OrmBmgwbz toDomain(OrmBmgwbzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmBmgwbz ormBmgwbz = new OrmBmgwbz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormBmgwbz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormBmgwbz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getGwzzsm() != null ) {
            ormBmgwbz.setGwzzsm( dto.getGwzzsm() );
        }
        if ( dto.getXh() != null ) {
            ormBmgwbz.setXh( dto.getXh() );
        }
        if ( dto.getNumcompilation() != null ) {
            ormBmgwbz.setNumcompilation( dto.getNumcompilation() );
        }
        if ( dto.getOrmbmgwbzname() != null ) {
            ormBmgwbz.setOrmbmgwbzname( dto.getOrmbmgwbzname() );
        }
        if ( dto.getOrmpostid() != null ) {
            ormBmgwbz.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmgwbzid() != null ) {
            ormBmgwbz.setOrmgwbzid( dto.getOrmgwbzid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormBmgwbz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmbmgwbzid() != null ) {
            ormBmgwbz.setOrmbmgwbzid( dto.getOrmbmgwbzid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormBmgwbz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormBmgwbz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormBmgwbz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmpostname() != null ) {
            ormBmgwbz.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmgwbzmc() != null ) {
            ormBmgwbz.setOrmgwbzmc( dto.getOrmgwbzmc() );
        }

        return ormBmgwbz;
    }

    @Override
    public OrmBmgwbzDTO toDto(OrmBmgwbz entity) {
        if ( entity == null ) {
            return null;
        }

        OrmBmgwbzDTO ormBmgwbzDTO = new OrmBmgwbzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormBmgwbzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormBmgwbzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getGwzzsm() != null ) {
            ormBmgwbzDTO.setGwzzsm( entity.getGwzzsm() );
        }
        if ( entity.getXh() != null ) {
            ormBmgwbzDTO.setXh( entity.getXh() );
        }
        if ( entity.getNumcompilation() != null ) {
            ormBmgwbzDTO.setNumcompilation( entity.getNumcompilation() );
        }
        if ( entity.getOrmbmgwbzname() != null ) {
            ormBmgwbzDTO.setOrmbmgwbzname( entity.getOrmbmgwbzname() );
        }
        if ( entity.getOrmpostid() != null ) {
            ormBmgwbzDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmgwbzid() != null ) {
            ormBmgwbzDTO.setOrmgwbzid( entity.getOrmgwbzid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormBmgwbzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmbmgwbzid() != null ) {
            ormBmgwbzDTO.setOrmbmgwbzid( entity.getOrmbmgwbzid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormBmgwbzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormBmgwbzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormBmgwbzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmpostname() != null ) {
            ormBmgwbzDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmgwbzmc() != null ) {
            ormBmgwbzDTO.setOrmgwbzmc( entity.getOrmgwbzmc() );
        }

        return ormBmgwbzDTO;
    }

    @Override
    public List<OrmBmgwbz> toDomain(List<OrmBmgwbzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmBmgwbz> list = new ArrayList<OrmBmgwbz>( dtoList.size() );
        for ( OrmBmgwbzDTO ormBmgwbzDTO : dtoList ) {
            list.add( toDomain( ormBmgwbzDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmBmgwbzDTO> toDto(List<OrmBmgwbz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmBmgwbzDTO> list = new ArrayList<OrmBmgwbzDTO>( entityList.size() );
        for ( OrmBmgwbz ormBmgwbz : entityList ) {
            list.add( toDto( ormBmgwbz ) );
        }

        return list;
    }
}
