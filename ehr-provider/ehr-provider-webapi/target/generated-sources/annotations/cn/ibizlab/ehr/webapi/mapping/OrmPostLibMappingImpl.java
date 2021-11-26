package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmPostLib;
import cn.ibizlab.ehr.webapi.dto.OrmPostLibDTO;
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
public class OrmPostLibMappingImpl implements OrmPostLibMapping {

    @Override
    public OrmPostLib toDomain(OrmPostLibDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmPostLib ormPostLib = new OrmPostLib();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormPostLib.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormPostLib.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMustexcyear() != null ) {
            ormPostLib.setMustexcyear( dto.getMustexcyear() );
        }
        if ( dto.getPostnature() != null ) {
            ormPostLib.setPostnature( dto.getPostnature() );
        }
        if ( dto.getJobdesc() != null ) {
            ormPostLib.setJobdesc( dto.getJobdesc() );
        }
        if ( dto.getGwflag() != null ) {
            ormPostLib.setGwflag( dto.getGwflag() );
        }
        if ( dto.getSugexcyear() != null ) {
            ormPostLib.setSugexcyear( dto.getSugexcyear() );
        }
        if ( dto.getGwtype() != null ) {
            ormPostLib.setGwtype( dto.getGwtype() );
        }
        if ( dto.getIsconfidential() != null ) {
            ormPostLib.setIsconfidential( dto.getIsconfidential() );
        }
        if ( dto.getOrmpostlibname() != null ) {
            ormPostLib.setOrmpostlibname( dto.getOrmpostlibname() );
        }
        if ( dto.getCreatedate() != null ) {
            ormPostLib.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmpostlibid() != null ) {
            ormPostLib.setOrmpostlibid( dto.getOrmpostlibid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormPostLib.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormPostLib.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            ormPostLib.setUpdateman( dto.getUpdateman() );
        }

        return ormPostLib;
    }

    @Override
    public OrmPostLibDTO toDto(OrmPostLib entity) {
        if ( entity == null ) {
            return null;
        }

        OrmPostLibDTO ormPostLibDTO = new OrmPostLibDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormPostLibDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormPostLibDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMustexcyear() != null ) {
            ormPostLibDTO.setMustexcyear( entity.getMustexcyear() );
        }
        if ( entity.getPostnature() != null ) {
            ormPostLibDTO.setPostnature( entity.getPostnature() );
        }
        if ( entity.getJobdesc() != null ) {
            ormPostLibDTO.setJobdesc( entity.getJobdesc() );
        }
        if ( entity.getGwflag() != null ) {
            ormPostLibDTO.setGwflag( entity.getGwflag() );
        }
        if ( entity.getSugexcyear() != null ) {
            ormPostLibDTO.setSugexcyear( entity.getSugexcyear() );
        }
        if ( entity.getGwtype() != null ) {
            ormPostLibDTO.setGwtype( entity.getGwtype() );
        }
        if ( entity.getIsconfidential() != null ) {
            ormPostLibDTO.setIsconfidential( entity.getIsconfidential() );
        }
        if ( entity.getOrmpostlibname() != null ) {
            ormPostLibDTO.setOrmpostlibname( entity.getOrmpostlibname() );
        }
        if ( entity.getCreatedate() != null ) {
            ormPostLibDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmpostlibid() != null ) {
            ormPostLibDTO.setOrmpostlibid( entity.getOrmpostlibid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormPostLibDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormPostLibDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            ormPostLibDTO.setUpdateman( entity.getUpdateman() );
        }

        return ormPostLibDTO;
    }

    @Override
    public List<OrmPostLib> toDomain(List<OrmPostLibDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmPostLib> list = new ArrayList<OrmPostLib>( dtoList.size() );
        for ( OrmPostLibDTO ormPostLibDTO : dtoList ) {
            list.add( toDomain( ormPostLibDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmPostLibDTO> toDto(List<OrmPostLib> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmPostLibDTO> list = new ArrayList<OrmPostLibDTO>( entityList.size() );
        for ( OrmPostLib ormPostLib : entityList ) {
            list.add( toDto( ormPostLib ) );
        }

        return list;
    }
}
