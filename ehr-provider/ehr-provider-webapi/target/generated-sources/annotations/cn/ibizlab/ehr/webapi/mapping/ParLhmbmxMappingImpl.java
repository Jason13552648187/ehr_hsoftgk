package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParLhmbmx;
import cn.ibizlab.ehr.webapi.dto.ParLhmbmxDTO;
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
public class ParLhmbmxMappingImpl implements ParLhmbmxMapping {

    @Override
    public ParLhmbmx toDomain(ParLhmbmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParLhmbmx parLhmbmx = new ParLhmbmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parLhmbmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parLhmbmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBzfz() != null ) {
            parLhmbmx.setBzfz( dto.getBzfz() );
        }
        if ( dto.getParlhmbmxname() != null ) {
            parLhmbmx.setParlhmbmxname( dto.getParlhmbmxname() );
        }
        if ( dto.getFj() != null ) {
            parLhmbmx.setFj( dto.getFj() );
        }
        if ( dto.getJzyq() != null ) {
            parLhmbmx.setJzyq( dto.getJzyq() );
        }
        if ( dto.getXh() != null ) {
            parLhmbmx.setXh( dto.getXh() );
        }
        if ( dto.getWcbz() != null ) {
            parLhmbmx.setWcbz( dto.getWcbz() );
        }
        if ( dto.getKhbf() != null ) {
            parLhmbmx.setKhbf( dto.getKhbf() );
        }
        if ( dto.getParjxlhmbid() != null ) {
            parLhmbmx.setParjxlhmbid( dto.getParjxlhmbid() );
        }
        if ( dto.getParlhmbmxid() != null ) {
            parLhmbmx.setParlhmbmxid( dto.getParlhmbmxid() );
        }
        if ( dto.getCreateman() != null ) {
            parLhmbmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parLhmbmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parLhmbmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parLhmbmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParjxlhmbname() != null ) {
            parLhmbmx.setParjxlhmbname( dto.getParjxlhmbname() );
        }

        return parLhmbmx;
    }

    @Override
    public ParLhmbmxDTO toDto(ParLhmbmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParLhmbmxDTO parLhmbmxDTO = new ParLhmbmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parLhmbmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parLhmbmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBzfz() != null ) {
            parLhmbmxDTO.setBzfz( entity.getBzfz() );
        }
        if ( entity.getParlhmbmxname() != null ) {
            parLhmbmxDTO.setParlhmbmxname( entity.getParlhmbmxname() );
        }
        if ( entity.getFj() != null ) {
            parLhmbmxDTO.setFj( entity.getFj() );
        }
        if ( entity.getJzyq() != null ) {
            parLhmbmxDTO.setJzyq( entity.getJzyq() );
        }
        if ( entity.getXh() != null ) {
            parLhmbmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getWcbz() != null ) {
            parLhmbmxDTO.setWcbz( entity.getWcbz() );
        }
        if ( entity.getKhbf() != null ) {
            parLhmbmxDTO.setKhbf( entity.getKhbf() );
        }
        if ( entity.getParjxlhmbid() != null ) {
            parLhmbmxDTO.setParjxlhmbid( entity.getParjxlhmbid() );
        }
        if ( entity.getParlhmbmxid() != null ) {
            parLhmbmxDTO.setParlhmbmxid( entity.getParlhmbmxid() );
        }
        if ( entity.getCreateman() != null ) {
            parLhmbmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parLhmbmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parLhmbmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parLhmbmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParjxlhmbname() != null ) {
            parLhmbmxDTO.setParjxlhmbname( entity.getParjxlhmbname() );
        }

        return parLhmbmxDTO;
    }

    @Override
    public List<ParLhmbmx> toDomain(List<ParLhmbmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParLhmbmx> list = new ArrayList<ParLhmbmx>( dtoList.size() );
        for ( ParLhmbmxDTO parLhmbmxDTO : dtoList ) {
            list.add( toDomain( parLhmbmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParLhmbmxDTO> toDto(List<ParLhmbmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParLhmbmxDTO> list = new ArrayList<ParLhmbmxDTO>( entityList.size() );
        for ( ParLhmbmx parLhmbmx : entityList ) {
            list.add( toDto( parLhmbmx ) );
        }

        return list;
    }
}
