package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmZwdqgz;
import cn.ibizlab.ehr.webapi.dto.OrmZwdqgzDTO;
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
public class OrmZwdqgzMappingImpl implements OrmZwdqgzMapping {

    @Override
    public OrmZwdqgz toDomain(OrmZwdqgzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmZwdqgz ormZwdqgz = new OrmZwdqgz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormZwdqgz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormZwdqgz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXb() != null ) {
            ormZwdqgz.setXb( dto.getXb() );
        }
        if ( dto.getZwlx() != null ) {
            ormZwdqgz.setZwlx( dto.getZwlx() );
        }
        if ( dto.getOrmzwdqgzname() != null ) {
            ormZwdqgz.setOrmzwdqgzname( dto.getOrmzwdqgzname() );
        }
        if ( dto.getSfmrdqnl() != null ) {
            ormZwdqgz.setSfmrdqnl( dto.getSfmrdqnl() );
        }
        if ( dto.getNl() != null ) {
            ormZwdqgz.setNl( dto.getNl() );
        }
        if ( dto.getZwbm() != null ) {
            ormZwdqgz.setZwbm( dto.getZwbm() );
        }
        if ( dto.getOrmrankid() != null ) {
            ormZwdqgz.setOrmrankid( dto.getOrmrankid() );
        }
        if ( dto.getOrmorgid() != null ) {
            ormZwdqgz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            ormZwdqgz.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmzwdqgzid() != null ) {
            ormZwdqgz.setOrmzwdqgzid( dto.getOrmzwdqgzid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormZwdqgz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormZwdqgz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            ormZwdqgz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormZwdqgz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            ormZwdqgz.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrmrankname() != null ) {
            ormZwdqgz.setOrmrankname( dto.getOrmrankname() );
        }
        if ( dto.getZzdzs() != null ) {
            ormZwdqgz.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmdutyname() != null ) {
            ormZwdqgz.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getOrmorgname() != null ) {
            ormZwdqgz.setOrmorgname( dto.getOrmorgname() );
        }

        return ormZwdqgz;
    }

    @Override
    public OrmZwdqgzDTO toDto(OrmZwdqgz entity) {
        if ( entity == null ) {
            return null;
        }

        OrmZwdqgzDTO ormZwdqgzDTO = new OrmZwdqgzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormZwdqgzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormZwdqgzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXb() != null ) {
            ormZwdqgzDTO.setXb( entity.getXb() );
        }
        if ( entity.getZwlx() != null ) {
            ormZwdqgzDTO.setZwlx( entity.getZwlx() );
        }
        if ( entity.getOrmzwdqgzname() != null ) {
            ormZwdqgzDTO.setOrmzwdqgzname( entity.getOrmzwdqgzname() );
        }
        if ( entity.getSfmrdqnl() != null ) {
            ormZwdqgzDTO.setSfmrdqnl( entity.getSfmrdqnl() );
        }
        if ( entity.getNl() != null ) {
            ormZwdqgzDTO.setNl( entity.getNl() );
        }
        if ( entity.getZwbm() != null ) {
            ormZwdqgzDTO.setZwbm( entity.getZwbm() );
        }
        if ( entity.getOrmrankid() != null ) {
            ormZwdqgzDTO.setOrmrankid( entity.getOrmrankid() );
        }
        if ( entity.getOrmorgid() != null ) {
            ormZwdqgzDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            ormZwdqgzDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmzwdqgzid() != null ) {
            ormZwdqgzDTO.setOrmzwdqgzid( entity.getOrmzwdqgzid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormZwdqgzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormZwdqgzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            ormZwdqgzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormZwdqgzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            ormZwdqgzDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrmrankname() != null ) {
            ormZwdqgzDTO.setOrmrankname( entity.getOrmrankname() );
        }
        if ( entity.getZzdzs() != null ) {
            ormZwdqgzDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmdutyname() != null ) {
            ormZwdqgzDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getOrmorgname() != null ) {
            ormZwdqgzDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return ormZwdqgzDTO;
    }

    @Override
    public List<OrmZwdqgz> toDomain(List<OrmZwdqgzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmZwdqgz> list = new ArrayList<OrmZwdqgz>( dtoList.size() );
        for ( OrmZwdqgzDTO ormZwdqgzDTO : dtoList ) {
            list.add( toDomain( ormZwdqgzDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmZwdqgzDTO> toDto(List<OrmZwdqgz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmZwdqgzDTO> list = new ArrayList<OrmZwdqgzDTO>( entityList.size() );
        for ( OrmZwdqgz ormZwdqgz : entityList ) {
            list.add( toDto( ormZwdqgz ) );
        }

        return list;
    }
}
