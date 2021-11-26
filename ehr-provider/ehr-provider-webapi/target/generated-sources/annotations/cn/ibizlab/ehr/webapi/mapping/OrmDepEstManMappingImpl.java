package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmDepEstMan;
import cn.ibizlab.ehr.webapi.dto.OrmDepEstManDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmDepEstManMappingImpl implements OrmDepEstManMapping {

    @Override
    public OrmDepEstMan toDomain(OrmDepEstManDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmDepEstMan ormDepEstMan = new OrmDepEstMan();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormDepEstMan.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormDepEstMan.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            ormDepEstMan.setXh( dto.getXh() );
        }
        if ( dto.getNumcompilation() != null ) {
            ormDepEstMan.setNumcompilation( dto.getNumcompilation() );
        }
        if ( dto.getOrmdepestmanname() != null ) {
            ormDepEstMan.setOrmdepestmanname( dto.getOrmdepestmanname() );
        }
        if ( dto.getZwzzsm() != null ) {
            ormDepEstMan.setZwzzsm( dto.getZwzzsm() );
        }
        if ( dto.getOrmzwbzid() != null ) {
            ormDepEstMan.setOrmzwbzid( dto.getOrmzwbzid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            ormDepEstMan.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormDepEstMan.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            ormDepEstMan.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormDepEstMan.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormDepEstMan.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmdepestmanid() != null ) {
            ormDepEstMan.setOrmdepestmanid( dto.getOrmdepestmanid() );
        }
        if ( dto.getOrmdutyname() != null ) {
            ormDepEstMan.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getOrmzwbzmc() != null ) {
            ormDepEstMan.setOrmzwbzmc( dto.getOrmzwbzmc() );
        }

        return ormDepEstMan;
    }

    @Override
    public OrmDepEstManDTO toDto(OrmDepEstMan entity) {
        if ( entity == null ) {
            return null;
        }

        OrmDepEstManDTO ormDepEstManDTO = new OrmDepEstManDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormDepEstManDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormDepEstManDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            ormDepEstManDTO.setXh( entity.getXh() );
        }
        if ( entity.getNumcompilation() != null ) {
            ormDepEstManDTO.setNumcompilation( entity.getNumcompilation() );
        }
        if ( entity.getOrmdepestmanname() != null ) {
            ormDepEstManDTO.setOrmdepestmanname( entity.getOrmdepestmanname() );
        }
        if ( entity.getZwzzsm() != null ) {
            ormDepEstManDTO.setZwzzsm( entity.getZwzzsm() );
        }
        if ( entity.getOrmzwbzid() != null ) {
            ormDepEstManDTO.setOrmzwbzid( entity.getOrmzwbzid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            ormDepEstManDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormDepEstManDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            ormDepEstManDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormDepEstManDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormDepEstManDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmdepestmanid() != null ) {
            ormDepEstManDTO.setOrmdepestmanid( entity.getOrmdepestmanid() );
        }
        if ( entity.getOrmdutyname() != null ) {
            ormDepEstManDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getOrmzwbzmc() != null ) {
            ormDepEstManDTO.setOrmzwbzmc( entity.getOrmzwbzmc() );
        }

        return ormDepEstManDTO;
    }

    @Override
    public List<OrmDepEstMan> toDomain(List<OrmDepEstManDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmDepEstMan> list = new ArrayList<OrmDepEstMan>( dtoList.size() );
        for ( OrmDepEstManDTO ormDepEstManDTO : dtoList ) {
            list.add( toDomain( ormDepEstManDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmDepEstManDTO> toDto(List<OrmDepEstMan> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmDepEstManDTO> list = new ArrayList<OrmDepEstManDTO>( entityList.size() );
        for ( OrmDepEstMan ormDepEstMan : entityList ) {
            list.add( toDto( ormDepEstMan ) );
        }

        return list;
    }
}
