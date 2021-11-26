package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimVocational;
import cn.ibizlab.ehr.webapi.dto.PimVocationalDTO;
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
public class PimVocationalMappingImpl implements PimVocationalMapping {

    @Override
    public PimVocational toDomain(PimVocationalDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimVocational pimVocational = new PimVocational();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimVocational.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimVocational.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXzcsj() != null ) {
            pimVocational.setXzcsj( dto.getXzcsj() );
        }
        if ( dto.getRegisnumber() != null ) {
            pimVocational.setRegisnumber( dto.getRegisnumber() );
        }
        if ( dto.getSyqk() != null ) {
            pimVocational.setSyqk( dto.getSyqk() );
        }
        if ( dto.getPimvocationalname() != null ) {
            pimVocational.setPimvocationalname( dto.getPimvocationalname() );
        }
        if ( dto.getZghqrq() != null ) {
            pimVocational.setZghqrq( dto.getZghqrq() );
        }
        if ( dto.getPractqualcertno() != null ) {
            pimVocational.setPractqualcertno( dto.getPractqualcertno() );
        }
        if ( dto.getFzyxq() != null ) {
            pimVocational.setFzyxq( dto.getFzyxq() );
        }
        if ( dto.getSocsecpayunit() != null ) {
            pimVocational.setSocsecpayunit( dto.getSocsecpayunit() );
        }
        if ( dto.getBcardnumber() != null ) {
            pimVocational.setBcardnumber( dto.getBcardnumber() );
        }
        if ( dto.getReason() != null ) {
            pimVocational.setReason( dto.getReason() );
        }
        if ( dto.getNjsj() != null ) {
            pimVocational.setNjsj( dto.getNjsj() );
        }
        if ( dto.getFj() != null ) {
            pimVocational.setFj( dto.getFj() );
        }
        if ( dto.getJlczz() != null ) {
            pimVocational.setJlczz( dto.getJlczz() );
        }
        if ( dto.getZcdw() != null ) {
            pimVocational.setZcdw( dto.getZcdw() );
        }
        if ( dto.getZyfl() != null ) {
            pimVocational.setZyfl( dto.getZyfl() );
        }
        if ( dto.getZgsydw() != null ) {
            pimVocational.setZgsydw( dto.getZgsydw() );
        }
        if ( dto.getJlglbh() != null ) {
            pimVocational.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getSxrq() != null ) {
            pimVocational.setSxrq( dto.getSxrq() );
        }
        if ( dto.getNsqk() != null ) {
            pimVocational.setNsqk( dto.getNsqk() );
        }
        if ( dto.getZslx() != null ) {
            pimVocational.setZslx( dto.getZslx() );
        }
        if ( dto.getJlss() != null ) {
            pimVocational.setJlss( dto.getJlss() );
        }
        if ( dto.getCszcsj() != null ) {
            pimVocational.setCszcsj( dto.getCszcsj() );
        }
        if ( dto.getJlspzt() != null ) {
            pimVocational.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getJbfl() != null ) {
            pimVocational.setJbfl( dto.getJbfl() );
        }
        if ( dto.getZgzsbh() != null ) {
            pimVocational.setZgzsbh( dto.getZgzsbh() );
        }
        if ( dto.getAlteration() != null ) {
            pimVocational.setAlteration( dto.getAlteration() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pimVocational.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getPimqualmajorname() != null ) {
            pimVocational.setPimqualmajorname( dto.getPimqualmajorname() );
        }
        if ( dto.getYgbh() != null ) {
            pimVocational.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimVocational.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimVocational.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimvocationalcatalogid() != null ) {
            pimVocational.setPimvocationalcatalogid( dto.getPimvocationalcatalogid() );
        }
        if ( dto.getOrmsignorgid() != null ) {
            pimVocational.setOrmsignorgid( dto.getOrmsignorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimVocational.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimqualmajorid() != null ) {
            pimVocational.setPimqualmajorid( dto.getPimqualmajorid() );
        }
        if ( dto.getPimqualtypeid() != null ) {
            pimVocational.setPimqualtypeid( dto.getPimqualtypeid() );
        }
        if ( dto.getSpstate() != null ) {
            pimVocational.setSpstate( dto.getSpstate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimVocational.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getZssyts() != null ) {
            pimVocational.setZssyts( dto.getZssyts() );
        }
        if ( dto.getCreateman() != null ) {
            pimVocational.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSxrqColor() != null ) {
            pimVocational.setSxrqColor( dto.getSxrqColor() );
        }
        if ( dto.getEnable() != null ) {
            pimVocational.setEnable( dto.getEnable() );
        }
        if ( dto.getPimvocationalid() != null ) {
            pimVocational.setPimvocationalid( dto.getPimvocationalid() );
        }
        if ( dto.getZsmc() != null ) {
            pimVocational.setZsmc( dto.getZsmc() );
        }
        if ( dto.getOrgid() != null ) {
            pimVocational.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimVocational.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimVocational.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgid2() != null ) {
            pimVocational.setOrmorgid2( dto.getOrmorgid2() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimVocational.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgname2() != null ) {
            pimVocational.setOrmorgname2( dto.getOrmorgname2() );
        }
        if ( dto.getPimvocationalcatalogname() != null ) {
            pimVocational.setPimvocationalcatalogname( dto.getPimvocationalcatalogname() );
        }
        if ( dto.getZzdzs() != null ) {
            pimVocational.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimVocational.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmsignorgname() != null ) {
            pimVocational.setOrmsignorgname( dto.getOrmsignorgname() );
        }
        if ( dto.getYgzt() != null ) {
            pimVocational.setYgzt( dto.getYgzt() );
        }
        if ( dto.getPimqualtypename() != null ) {
            pimVocational.setPimqualtypename( dto.getPimqualtypename() );
        }

        return pimVocational;
    }

    @Override
    public PimVocationalDTO toDto(PimVocational entity) {
        if ( entity == null ) {
            return null;
        }

        PimVocationalDTO pimVocationalDTO = new PimVocationalDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimVocationalDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimVocationalDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXzcsj() != null ) {
            pimVocationalDTO.setXzcsj( entity.getXzcsj() );
        }
        if ( entity.getRegisnumber() != null ) {
            pimVocationalDTO.setRegisnumber( entity.getRegisnumber() );
        }
        if ( entity.getSyqk() != null ) {
            pimVocationalDTO.setSyqk( entity.getSyqk() );
        }
        if ( entity.getPimvocationalname() != null ) {
            pimVocationalDTO.setPimvocationalname( entity.getPimvocationalname() );
        }
        if ( entity.getZghqrq() != null ) {
            pimVocationalDTO.setZghqrq( entity.getZghqrq() );
        }
        if ( entity.getPractqualcertno() != null ) {
            pimVocationalDTO.setPractqualcertno( entity.getPractqualcertno() );
        }
        if ( entity.getFzyxq() != null ) {
            pimVocationalDTO.setFzyxq( entity.getFzyxq() );
        }
        if ( entity.getSocsecpayunit() != null ) {
            pimVocationalDTO.setSocsecpayunit( entity.getSocsecpayunit() );
        }
        if ( entity.getBcardnumber() != null ) {
            pimVocationalDTO.setBcardnumber( entity.getBcardnumber() );
        }
        if ( entity.getReason() != null ) {
            pimVocationalDTO.setReason( entity.getReason() );
        }
        if ( entity.getNjsj() != null ) {
            pimVocationalDTO.setNjsj( entity.getNjsj() );
        }
        if ( entity.getFj() != null ) {
            pimVocationalDTO.setFj( entity.getFj() );
        }
        if ( entity.getJlczz() != null ) {
            pimVocationalDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getZcdw() != null ) {
            pimVocationalDTO.setZcdw( entity.getZcdw() );
        }
        if ( entity.getZyfl() != null ) {
            pimVocationalDTO.setZyfl( entity.getZyfl() );
        }
        if ( entity.getZgsydw() != null ) {
            pimVocationalDTO.setZgsydw( entity.getZgsydw() );
        }
        if ( entity.getJlglbh() != null ) {
            pimVocationalDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getSxrq() != null ) {
            pimVocationalDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getNsqk() != null ) {
            pimVocationalDTO.setNsqk( entity.getNsqk() );
        }
        if ( entity.getZslx() != null ) {
            pimVocationalDTO.setZslx( entity.getZslx() );
        }
        if ( entity.getJlss() != null ) {
            pimVocationalDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getCszcsj() != null ) {
            pimVocationalDTO.setCszcsj( entity.getCszcsj() );
        }
        if ( entity.getJlspzt() != null ) {
            pimVocationalDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getJbfl() != null ) {
            pimVocationalDTO.setJbfl( entity.getJbfl() );
        }
        if ( entity.getZgzsbh() != null ) {
            pimVocationalDTO.setZgzsbh( entity.getZgzsbh() );
        }
        if ( entity.getAlteration() != null ) {
            pimVocationalDTO.setAlteration( entity.getAlteration() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pimVocationalDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getPimqualmajorname() != null ) {
            pimVocationalDTO.setPimqualmajorname( entity.getPimqualmajorname() );
        }
        if ( entity.getYgbh() != null ) {
            pimVocationalDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimVocationalDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimVocationalDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimvocationalcatalogid() != null ) {
            pimVocationalDTO.setPimvocationalcatalogid( entity.getPimvocationalcatalogid() );
        }
        if ( entity.getOrmsignorgid() != null ) {
            pimVocationalDTO.setOrmsignorgid( entity.getOrmsignorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimVocationalDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimqualmajorid() != null ) {
            pimVocationalDTO.setPimqualmajorid( entity.getPimqualmajorid() );
        }
        if ( entity.getPimqualtypeid() != null ) {
            pimVocationalDTO.setPimqualtypeid( entity.getPimqualtypeid() );
        }
        if ( entity.getSpstate() != null ) {
            pimVocationalDTO.setSpstate( entity.getSpstate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimVocationalDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getZssyts() != null ) {
            pimVocationalDTO.setZssyts( entity.getZssyts() );
        }
        if ( entity.getCreateman() != null ) {
            pimVocationalDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSxrqColor() != null ) {
            pimVocationalDTO.setSxrqColor( entity.getSxrqColor() );
        }
        if ( entity.getEnable() != null ) {
            pimVocationalDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPimvocationalid() != null ) {
            pimVocationalDTO.setPimvocationalid( entity.getPimvocationalid() );
        }
        if ( entity.getZsmc() != null ) {
            pimVocationalDTO.setZsmc( entity.getZsmc() );
        }
        if ( entity.getOrgid() != null ) {
            pimVocationalDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimVocationalDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimVocationalDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgid2() != null ) {
            pimVocationalDTO.setOrmorgid2( entity.getOrmorgid2() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimVocationalDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgname2() != null ) {
            pimVocationalDTO.setOrmorgname2( entity.getOrmorgname2() );
        }
        if ( entity.getPimvocationalcatalogname() != null ) {
            pimVocationalDTO.setPimvocationalcatalogname( entity.getPimvocationalcatalogname() );
        }
        if ( entity.getZzdzs() != null ) {
            pimVocationalDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimVocationalDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmsignorgname() != null ) {
            pimVocationalDTO.setOrmsignorgname( entity.getOrmsignorgname() );
        }
        if ( entity.getYgzt() != null ) {
            pimVocationalDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getPimqualtypename() != null ) {
            pimVocationalDTO.setPimqualtypename( entity.getPimqualtypename() );
        }

        return pimVocationalDTO;
    }

    @Override
    public List<PimVocational> toDomain(List<PimVocationalDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimVocational> list = new ArrayList<PimVocational>( dtoList.size() );
        for ( PimVocationalDTO pimVocationalDTO : dtoList ) {
            list.add( toDomain( pimVocationalDTO ) );
        }

        return list;
    }

    @Override
    public List<PimVocationalDTO> toDto(List<PimVocational> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimVocationalDTO> list = new ArrayList<PimVocationalDTO>( entityList.size() );
        for ( PimVocational pimVocational : entityList ) {
            list.add( toDto( pimVocational ) );
        }

        return list;
    }
}
