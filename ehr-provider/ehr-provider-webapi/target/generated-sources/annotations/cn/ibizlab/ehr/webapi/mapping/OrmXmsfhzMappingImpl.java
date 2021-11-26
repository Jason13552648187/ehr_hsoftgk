package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmsfhz;
import cn.ibizlab.ehr.webapi.dto.OrmXmsfhzDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmXmsfhzMappingImpl implements OrmXmsfhzMapping {

    @Override
    public OrmXmsfhz toDomain(OrmXmsfhzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmsfhz ormXmsfhz = new OrmXmsfhz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmsfhz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmsfhz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMonth() != null ) {
            ormXmsfhz.setMonth( dto.getMonth() );
        }
        if ( dto.getAugy() != null ) {
            ormXmsfhz.setAugy( dto.getAugy() );
        }
        if ( dto.getEy() != null ) {
            ormXmsfhz.setEy( dto.getEy() );
        }
        if ( dto.getJy() != null ) {
            ormXmsfhz.setJy( dto.getJy() );
        }
        if ( dto.getApy() != null ) {
            ormXmsfhz.setApy( dto.getApy() );
        }
        if ( dto.getYy() != null ) {
            ormXmsfhz.setYy( dto.getYy() );
        }
        if ( dto.getGw() != null ) {
            ormXmsfhz.setGw( dto.getGw() );
        }
        if ( dto.getXm() != null ) {
            ormXmsfhz.setXm( dto.getXm() );
        }
        if ( dto.getSyy() != null ) {
            ormXmsfhz.setSyy( dto.getSyy() );
        }
        if ( dto.getSy() != null ) {
            ormXmsfhz.setSy( dto.getSy() );
        }
        if ( dto.getOcty() != null ) {
            ormXmsfhz.setOcty( dto.getOcty() );
        }
        if ( dto.getRs() != null ) {
            ormXmsfhz.setRs( dto.getRs() );
        }
        if ( dto.getOrmxmsfhzname() != null ) {
            ormXmsfhz.setOrmxmsfhzname( dto.getOrmxmsfhzname() );
        }
        if ( dto.getXh() != null ) {
            ormXmsfhz.setXh( dto.getXh() );
        }
        if ( dto.getWy() != null ) {
            ormXmsfhz.setWy( dto.getWy() );
        }
        if ( dto.getZz() != null ) {
            ormXmsfhz.setZz( dto.getZz() );
        }
        if ( dto.getLy() != null ) {
            ormXmsfhz.setLy( dto.getLy() );
        }
        if ( dto.getYf() != null ) {
            ormXmsfhz.setYf( dto.getYf() );
        }
        if ( dto.getNd() != null ) {
            ormXmsfhz.setNd( dto.getNd() );
        }
        if ( dto.getQy() != null ) {
            ormXmsfhz.setQy( dto.getQy() );
        }
        if ( dto.getOrgid() != null ) {
            ormXmsfhz.setOrgid( dto.getOrgid() );
        }
        if ( dto.getAugyColor() != null ) {
            ormXmsfhz.setAugyColor( dto.getAugyColor() );
        }
        if ( dto.getYfColor() != null ) {
            ormXmsfhz.setYfColor( dto.getYfColor() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmsfhz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getQyColor() != null ) {
            ormXmsfhz.setQyColor( dto.getQyColor() );
        }
        if ( dto.getSyyColor() != null ) {
            ormXmsfhz.setSyyColor( dto.getSyyColor() );
        }
        if ( dto.getOrmxmsfhzid() != null ) {
            ormXmsfhz.setOrmxmsfhzid( dto.getOrmxmsfhzid() );
        }
        if ( dto.getSyColor() != null ) {
            ormXmsfhz.setSyColor( dto.getSyColor() );
        }
        if ( dto.getWyColor() != null ) {
            ormXmsfhz.setWyColor( dto.getWyColor() );
        }
        if ( dto.getEyColor() != null ) {
            ormXmsfhz.setEyColor( dto.getEyColor() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmsfhz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getApyColor() != null ) {
            ormXmsfhz.setApyColor( dto.getApyColor() );
        }
        if ( dto.getYyColor() != null ) {
            ormXmsfhz.setYyColor( dto.getYyColor() );
        }
        if ( dto.getJyColor() != null ) {
            ormXmsfhz.setJyColor( dto.getJyColor() );
        }
        if ( dto.getLyColor() != null ) {
            ormXmsfhz.setLyColor( dto.getLyColor() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmsfhz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmsfhz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOctyColor() != null ) {
            ormXmsfhz.setOctyColor( dto.getOctyColor() );
        }

        return ormXmsfhz;
    }

    @Override
    public OrmXmsfhzDTO toDto(OrmXmsfhz entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmsfhzDTO ormXmsfhzDTO = new OrmXmsfhzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmsfhzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmsfhzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMonth() != null ) {
            ormXmsfhzDTO.setMonth( entity.getMonth() );
        }
        if ( entity.getAugy() != null ) {
            ormXmsfhzDTO.setAugy( entity.getAugy() );
        }
        if ( entity.getEy() != null ) {
            ormXmsfhzDTO.setEy( entity.getEy() );
        }
        if ( entity.getJy() != null ) {
            ormXmsfhzDTO.setJy( entity.getJy() );
        }
        if ( entity.getApy() != null ) {
            ormXmsfhzDTO.setApy( entity.getApy() );
        }
        if ( entity.getYy() != null ) {
            ormXmsfhzDTO.setYy( entity.getYy() );
        }
        if ( entity.getGw() != null ) {
            ormXmsfhzDTO.setGw( entity.getGw() );
        }
        if ( entity.getXm() != null ) {
            ormXmsfhzDTO.setXm( entity.getXm() );
        }
        if ( entity.getSyy() != null ) {
            ormXmsfhzDTO.setSyy( entity.getSyy() );
        }
        if ( entity.getSy() != null ) {
            ormXmsfhzDTO.setSy( entity.getSy() );
        }
        if ( entity.getOcty() != null ) {
            ormXmsfhzDTO.setOcty( entity.getOcty() );
        }
        if ( entity.getRs() != null ) {
            ormXmsfhzDTO.setRs( entity.getRs() );
        }
        if ( entity.getOrmxmsfhzname() != null ) {
            ormXmsfhzDTO.setOrmxmsfhzname( entity.getOrmxmsfhzname() );
        }
        if ( entity.getXh() != null ) {
            ormXmsfhzDTO.setXh( entity.getXh() );
        }
        if ( entity.getWy() != null ) {
            ormXmsfhzDTO.setWy( entity.getWy() );
        }
        if ( entity.getZz() != null ) {
            ormXmsfhzDTO.setZz( entity.getZz() );
        }
        if ( entity.getLy() != null ) {
            ormXmsfhzDTO.setLy( entity.getLy() );
        }
        if ( entity.getYf() != null ) {
            ormXmsfhzDTO.setYf( entity.getYf() );
        }
        if ( entity.getNd() != null ) {
            ormXmsfhzDTO.setNd( entity.getNd() );
        }
        if ( entity.getQy() != null ) {
            ormXmsfhzDTO.setQy( entity.getQy() );
        }
        if ( entity.getOrgid() != null ) {
            ormXmsfhzDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getAugyColor() != null ) {
            ormXmsfhzDTO.setAugyColor( entity.getAugyColor() );
        }
        if ( entity.getYfColor() != null ) {
            ormXmsfhzDTO.setYfColor( entity.getYfColor() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmsfhzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getQyColor() != null ) {
            ormXmsfhzDTO.setQyColor( entity.getQyColor() );
        }
        if ( entity.getSyyColor() != null ) {
            ormXmsfhzDTO.setSyyColor( entity.getSyyColor() );
        }
        if ( entity.getOrmxmsfhzid() != null ) {
            ormXmsfhzDTO.setOrmxmsfhzid( entity.getOrmxmsfhzid() );
        }
        if ( entity.getSyColor() != null ) {
            ormXmsfhzDTO.setSyColor( entity.getSyColor() );
        }
        if ( entity.getWyColor() != null ) {
            ormXmsfhzDTO.setWyColor( entity.getWyColor() );
        }
        if ( entity.getEyColor() != null ) {
            ormXmsfhzDTO.setEyColor( entity.getEyColor() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmsfhzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getApyColor() != null ) {
            ormXmsfhzDTO.setApyColor( entity.getApyColor() );
        }
        if ( entity.getYyColor() != null ) {
            ormXmsfhzDTO.setYyColor( entity.getYyColor() );
        }
        if ( entity.getJyColor() != null ) {
            ormXmsfhzDTO.setJyColor( entity.getJyColor() );
        }
        if ( entity.getLyColor() != null ) {
            ormXmsfhzDTO.setLyColor( entity.getLyColor() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmsfhzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmsfhzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOctyColor() != null ) {
            ormXmsfhzDTO.setOctyColor( entity.getOctyColor() );
        }

        return ormXmsfhzDTO;
    }

    @Override
    public List<OrmXmsfhz> toDomain(List<OrmXmsfhzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmsfhz> list = new ArrayList<OrmXmsfhz>( dtoList.size() );
        for ( OrmXmsfhzDTO ormXmsfhzDTO : dtoList ) {
            list.add( toDomain( ormXmsfhzDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmsfhzDTO> toDto(List<OrmXmsfhz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmsfhzDTO> list = new ArrayList<OrmXmsfhzDTO>( entityList.size() );
        for ( OrmXmsfhz ormXmsfhz : entityList ) {
            list.add( toDto( ormXmsfhz ) );
        }

        return list;
    }
}
