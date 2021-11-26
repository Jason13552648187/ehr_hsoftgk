package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimTitle;
import cn.ibizlab.ehr.webapi.dto.PimTitleDTO;
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
public class PimTitleMappingImpl implements PimTitleMapping {

    @Override
    public PimTitle toDomain(PimTitleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimTitle pimTitle = new PimTitle();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimTitle.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimTitle.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFj() != null ) {
            pimTitle.setFj( dto.getFj() );
        }
        if ( dto.getSfzgzc() != null ) {
            pimTitle.setSfzgzc( dto.getSfzgzc() );
        }
        if ( dto.getJlglbh() != null ) {
            pimTitle.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getReviewbody() != null ) {
            pimTitle.setReviewbody( dto.getReviewbody() );
        }
        if ( dto.getDuration() != null ) {
            pimTitle.setDuration( dto.getDuration() );
        }
        if ( dto.getZcdj() != null ) {
            pimTitle.setZcdj( dto.getZcdj() );
        }
        if ( dto.getCareername() != null ) {
            pimTitle.setCareername( dto.getCareername() );
        }
        if ( dto.getJlspzt() != null ) {
            pimTitle.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getReason() != null ) {
            pimTitle.setReason( dto.getReason() );
        }
        if ( dto.getPdjg() != null ) {
            pimTitle.setPdjg( dto.getPdjg() );
        }
        if ( dto.getJlss() != null ) {
            pimTitle.setJlss( dto.getJlss() );
        }
        if ( dto.getEmploytime() != null ) {
            pimTitle.setEmploytime( dto.getEmploytime() );
        }
        if ( dto.getEnclosure() != null ) {
            pimTitle.setEnclosure( dto.getEnclosure() );
        }
        if ( dto.getZcbh() != null ) {
            pimTitle.setZcbh( dto.getZcbh() );
        }
        if ( dto.getZchqrq() != null ) {
            pimTitle.setZchqrq( dto.getZchqrq() );
        }
        if ( dto.getMajorengaged() != null ) {
            pimTitle.setMajorengaged( dto.getMajorengaged() );
        }
        if ( dto.getLssuingagency() != null ) {
            pimTitle.setLssuingagency( dto.getLssuingagency() );
        }
        if ( dto.getPimtitlename() != null ) {
            pimTitle.setPimtitlename( dto.getPimtitlename() );
        }
        if ( dto.getJlczz() != null ) {
            pimTitle.setJlczz( dto.getJlczz() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimTitle.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimtitlecatalogueid() != null ) {
            pimTitle.setPimtitlecatalogueid( dto.getPimtitlecatalogueid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimTitle.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimTitle.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSpstate() != null ) {
            pimTitle.setSpstate( dto.getSpstate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimTitle.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getOrgid() != null ) {
            pimTitle.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimTitle.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimtitleid() != null ) {
            pimTitle.setPimtitleid( dto.getPimtitleid() );
        }
        if ( dto.getEnable() != null ) {
            pimTitle.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pimTitle.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimTitle.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimTitle.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPimtitlecataloguename() != null ) {
            pimTitle.setPimtitlecataloguename( dto.getPimtitlecataloguename() );
        }
        if ( dto.getYgbh() != null ) {
            pimTitle.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimTitle.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getYgzt() != null ) {
            pimTitle.setYgzt( dto.getYgzt() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimTitle.setOrmorgid( dto.getOrmorgid() );
        }

        return pimTitle;
    }

    @Override
    public PimTitleDTO toDto(PimTitle entity) {
        if ( entity == null ) {
            return null;
        }

        PimTitleDTO pimTitleDTO = new PimTitleDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimTitleDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimTitleDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFj() != null ) {
            pimTitleDTO.setFj( entity.getFj() );
        }
        if ( entity.getSfzgzc() != null ) {
            pimTitleDTO.setSfzgzc( entity.getSfzgzc() );
        }
        if ( entity.getJlglbh() != null ) {
            pimTitleDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getReviewbody() != null ) {
            pimTitleDTO.setReviewbody( entity.getReviewbody() );
        }
        if ( entity.getDuration() != null ) {
            pimTitleDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getZcdj() != null ) {
            pimTitleDTO.setZcdj( entity.getZcdj() );
        }
        if ( entity.getCareername() != null ) {
            pimTitleDTO.setCareername( entity.getCareername() );
        }
        if ( entity.getJlspzt() != null ) {
            pimTitleDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getReason() != null ) {
            pimTitleDTO.setReason( entity.getReason() );
        }
        if ( entity.getPdjg() != null ) {
            pimTitleDTO.setPdjg( entity.getPdjg() );
        }
        if ( entity.getJlss() != null ) {
            pimTitleDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getEmploytime() != null ) {
            pimTitleDTO.setEmploytime( entity.getEmploytime() );
        }
        if ( entity.getEnclosure() != null ) {
            pimTitleDTO.setEnclosure( entity.getEnclosure() );
        }
        if ( entity.getZcbh() != null ) {
            pimTitleDTO.setZcbh( entity.getZcbh() );
        }
        if ( entity.getZchqrq() != null ) {
            pimTitleDTO.setZchqrq( entity.getZchqrq() );
        }
        if ( entity.getMajorengaged() != null ) {
            pimTitleDTO.setMajorengaged( entity.getMajorengaged() );
        }
        if ( entity.getLssuingagency() != null ) {
            pimTitleDTO.setLssuingagency( entity.getLssuingagency() );
        }
        if ( entity.getPimtitlename() != null ) {
            pimTitleDTO.setPimtitlename( entity.getPimtitlename() );
        }
        if ( entity.getJlczz() != null ) {
            pimTitleDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimTitleDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimtitlecatalogueid() != null ) {
            pimTitleDTO.setPimtitlecatalogueid( entity.getPimtitlecatalogueid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimTitleDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimTitleDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSpstate() != null ) {
            pimTitleDTO.setSpstate( entity.getSpstate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimTitleDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getOrgid() != null ) {
            pimTitleDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimTitleDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimtitleid() != null ) {
            pimTitleDTO.setPimtitleid( entity.getPimtitleid() );
        }
        if ( entity.getEnable() != null ) {
            pimTitleDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pimTitleDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimTitleDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimTitleDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPimtitlecataloguename() != null ) {
            pimTitleDTO.setPimtitlecataloguename( entity.getPimtitlecataloguename() );
        }
        if ( entity.getYgbh() != null ) {
            pimTitleDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimTitleDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getYgzt() != null ) {
            pimTitleDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimTitleDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return pimTitleDTO;
    }

    @Override
    public List<PimTitle> toDomain(List<PimTitleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimTitle> list = new ArrayList<PimTitle>( dtoList.size() );
        for ( PimTitleDTO pimTitleDTO : dtoList ) {
            list.add( toDomain( pimTitleDTO ) );
        }

        return list;
    }

    @Override
    public List<PimTitleDTO> toDto(List<PimTitle> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimTitleDTO> list = new ArrayList<PimTitleDTO>( entityList.size() );
        for ( PimTitle pimTitle : entityList ) {
            list.add( toDto( pimTitle ) );
        }

        return list;
    }
}
