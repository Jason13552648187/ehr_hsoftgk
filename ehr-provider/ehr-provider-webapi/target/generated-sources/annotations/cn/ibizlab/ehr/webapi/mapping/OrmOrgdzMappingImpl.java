package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmOrgdz;
import cn.ibizlab.ehr.webapi.dto.OrmOrgdzDTO;
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
public class OrmOrgdzMappingImpl implements OrmOrgdzMapping {

    @Override
    public OrmOrgdz toDomain(OrmOrgdzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmOrgdz ormOrgdz = new OrmOrgdz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormOrgdz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormOrgdz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDeforgaddress() != null ) {
            ormOrgdz.setDeforgaddress( dto.getDeforgaddress() );
        }
        if ( dto.getXh() != null ) {
            ormOrgdz.setXh( dto.getXh() );
        }
        if ( dto.getOrmorgdzname() != null ) {
            ormOrgdz.setOrmorgdzname( dto.getOrmorgdzname() );
        }
        if ( dto.getOrmorgid() != null ) {
            ormOrgdz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormOrgdz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgdzid() != null ) {
            ormOrgdz.setOrmorgdzid( dto.getOrmorgdzid() );
        }
        if ( dto.getCreateman() != null ) {
            ormOrgdz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormOrgdz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormOrgdz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            ormOrgdz.setOrmorgname( dto.getOrmorgname() );
        }

        return ormOrgdz;
    }

    @Override
    public OrmOrgdzDTO toDto(OrmOrgdz entity) {
        if ( entity == null ) {
            return null;
        }

        OrmOrgdzDTO ormOrgdzDTO = new OrmOrgdzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormOrgdzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormOrgdzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDeforgaddress() != null ) {
            ormOrgdzDTO.setDeforgaddress( entity.getDeforgaddress() );
        }
        if ( entity.getXh() != null ) {
            ormOrgdzDTO.setXh( entity.getXh() );
        }
        if ( entity.getOrmorgdzname() != null ) {
            ormOrgdzDTO.setOrmorgdzname( entity.getOrmorgdzname() );
        }
        if ( entity.getOrmorgid() != null ) {
            ormOrgdzDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormOrgdzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgdzid() != null ) {
            ormOrgdzDTO.setOrmorgdzid( entity.getOrmorgdzid() );
        }
        if ( entity.getCreateman() != null ) {
            ormOrgdzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormOrgdzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormOrgdzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            ormOrgdzDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return ormOrgdzDTO;
    }

    @Override
    public List<OrmOrgdz> toDomain(List<OrmOrgdzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmOrgdz> list = new ArrayList<OrmOrgdz>( dtoList.size() );
        for ( OrmOrgdzDTO ormOrgdzDTO : dtoList ) {
            list.add( toDomain( ormOrgdzDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmOrgdzDTO> toDto(List<OrmOrgdz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmOrgdzDTO> list = new ArrayList<OrmOrgdzDTO>( entityList.size() );
        for ( OrmOrgdz ormOrgdz : entityList ) {
            list.add( toDto( ormOrgdz ) );
        }

        return list;
    }
}
