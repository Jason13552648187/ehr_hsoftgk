package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmRank;
import cn.ibizlab.ehr.webapi.dto.OrmRankDTO;
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
public class OrmRankMappingImpl implements OrmRankMapping {

    @Override
    public OrmRank toDomain(OrmRankDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmRank ormRank = new OrmRank();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormRank.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormRank.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            ormRank.setXh( dto.getXh() );
        }
        if ( dto.getJyjlnx() != null ) {
            ormRank.setJyjlnx( dto.getJyjlnx() );
        }
        if ( dto.getZjsm() != null ) {
            ormRank.setZjsm( dto.getZjsm() );
        }
        if ( dto.getOrmrankname() != null ) {
            ormRank.setOrmrankname( dto.getOrmrankname() );
        }
        if ( dto.getCreatedate() != null ) {
            ormRank.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormRank.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormRank.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormRank.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmrankid() != null ) {
            ormRank.setOrmrankid( dto.getOrmrankid() );
        }

        return ormRank;
    }

    @Override
    public OrmRankDTO toDto(OrmRank entity) {
        if ( entity == null ) {
            return null;
        }

        OrmRankDTO ormRankDTO = new OrmRankDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormRankDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormRankDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            ormRankDTO.setXh( entity.getXh() );
        }
        if ( entity.getJyjlnx() != null ) {
            ormRankDTO.setJyjlnx( entity.getJyjlnx() );
        }
        if ( entity.getZjsm() != null ) {
            ormRankDTO.setZjsm( entity.getZjsm() );
        }
        if ( entity.getOrmrankname() != null ) {
            ormRankDTO.setOrmrankname( entity.getOrmrankname() );
        }
        if ( entity.getCreatedate() != null ) {
            ormRankDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormRankDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormRankDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormRankDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmrankid() != null ) {
            ormRankDTO.setOrmrankid( entity.getOrmrankid() );
        }

        return ormRankDTO;
    }

    @Override
    public List<OrmRank> toDomain(List<OrmRankDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmRank> list = new ArrayList<OrmRank>( dtoList.size() );
        for ( OrmRankDTO ormRankDTO : dtoList ) {
            list.add( toDomain( ormRankDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmRankDTO> toDto(List<OrmRank> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmRankDTO> list = new ArrayList<OrmRankDTO>( entityList.size() );
        for ( OrmRank ormRank : entityList ) {
            list.add( toDto( ormRank ) );
        }

        return list;
    }
}
